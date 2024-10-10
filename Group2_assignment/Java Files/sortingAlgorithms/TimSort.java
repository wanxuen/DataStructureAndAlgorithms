package sortingAlgorithms;

import java.util.*;

public class TimSort <T extends Comparable<T>> extends AbstractDataGenerator{
	private static final int RUN = 32;

    public void timSortA(List<T> list) {
    	int n = list.size();

        // Sort individual subarrays of size RUN
        for (int i = 0; i < n; i += RUN) {
            insertionSortA(list, i, Math.min((i + RUN - 1), (n - 1)));
        }

        // Start merging from size RUN (or 32). It will merge to form size 64, 128, 256, and so on...
        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                // Merge subarrays list[left...mid] and list[mid+1...right]
                if (mid < right) {
                    mergeA(list, left, mid, right);
                }
            }
        }
    }

    // Insertion sort for small subarrays
    public void insertionSortA(List<T> list, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            T temp = list.get(i);
            int j = i - 1;
            while (j >= left && list.get(j).compareTo(temp) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, temp);
        }
    }

    // Merge function to merge sorted runs
    public void mergeA(List<T> list, int left, int mid, int right) {
    	int len1 = mid - left + 1, len2 = right - mid;
        List<T> leftPart = new ArrayList<>(len1);
        List<T> rightPart = new ArrayList<>(len2);

        for (int i = 0; i < len1; i++) {
            leftPart.add(list.get(left + i));
        }
        for (int i = 0; i < len2; i++) {
            rightPart.add(list.get(mid + 1 + i));
        }

        int i = 0, j = 0, k = left;

        while (i < len1 && j < len2) {
            if (leftPart.get(i).compareTo(rightPart.get(j)) <= 0) {
                list.set(k++, leftPart.get(i++));
            } else {
                list.set(k++, rightPart.get(j++));
            }
        }

        while (i < len1) {
            list.set(k++, leftPart.get(i++));
        }

        while (j < len2) {
            list.set(k++, rightPart.get(j++));
        }
    }
    
	public Node<T> convertToNodeList(LinkedList<T> list) {
		if (list.isEmpty()) return null;

        Iterator<T> iterator = list.iterator();
        Node<T> head = new Node<>(iterator.next());
        Node<T> current = head;

        while (iterator.hasNext()) {
            Node<T> newNode = new Node<>(iterator.next());
            current.next = newNode;
            current = newNode;
        }

        return head;
    }
	
	// Utility to get the middle of the list
    public Node<T> getMiddle(Node<T> node) {
    	if (node == null) return null;
        Node<T> slow = node, fast = node.next;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    // Utility to merge two sorted linked lists
    public Node<T> mergeL(Node<T> left, Node<T> right) {
    	Node<T> dummy = new Node<>(null); // Dummy node to serve as the starting point of the merged list
        Node<T> tail = dummy; // Pointer to the end of the merged list

        while (left != null && right != null) {
            if (left.data.compareTo(right.data) <= 0) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        // Attach any remaining nodes from the non-empty list
        if (left != null) {
            tail.next = left;
        } else {
            tail.next = right;
        }

        return dummy.next; // Return the head of the merged list
    }

    // Merge Sort for Node-based Linked List
    public Node<T> mergeSortL(Node<T> node) {
    	if (node == null || node.next == null) {
            return node; // Base case: the list is empty or has one node
        }

        Node<T> middle = getMiddle(node);
        Node<T> nextOfMiddle = middle.next;
        middle.next = null;

        Node<T> left = mergeSortL(node);
        Node<T> right = mergeSortL(nextOfMiddle);

        return mergeL(left, right);
    }
    
    // TimSort Algorithm that accepts java.util.LinkedList
    public void timSortL(Node<T> nodeList) {
        nodeList = mergeSortL(nodeList);
    }
}
