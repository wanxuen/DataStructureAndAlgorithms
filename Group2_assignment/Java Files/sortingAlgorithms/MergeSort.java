package sortingAlgorithms;

import java.util.*;

public class MergeSort<T extends Comparable<T>> extends AbstractDataGenerator{
	public MergeSort() {
        super();
    }

    // MergeSort for ArrayLists or any List type
    public void mergeSort(List<T> list) {
        if (list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;
        List<T> left = new ArrayList<>(list.subList(0, mid));
        List<T> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    public void merge(List<T> list, List<T> left, List<T> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }

    // Node class for the linked list
    static class Node<T extends Comparable<T>> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // MergeSort for Linked Lists using Nodes
    public Node<T> mergeSort(Node<T> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<T> middle = getMiddle(head);
        Node<T> nextOfMiddle = middle.next;
        middle.next = null;

        Node<T> left = mergeSort(head);
        Node<T> right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

 // Utility method to merge two sorted linked lists iteratively
    private Node<T> sortedMerge(Node<T> left, Node<T> right) {
        // Dummy node to act as the starting point
        Node<T> dummy = new Node<>(null);
        Node<T> tail = dummy;

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

        // Attach the remaining nodes
        if (left != null) {
            tail.next = left;
        } else {
            tail.next = right;
        }

        // Return the merged list, which starts from dummy.next
        return dummy.next;
    }


    // Utility method to get the middle of the linked list
    private Node<T> getMiddle(Node<T> head) {
        if (head == null) {
            return null;
        }

        Node<T> slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    public MergeSort.Node<T> convertToNodeList(LinkedList<T> linkedList) {
        MergeSort.Node<T> head = null;
        MergeSort.Node<T> tail = null;

        for (T value : linkedList) {
            MergeSort.Node<T> newNode = new MergeSort.Node<>(value);

            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }
}
