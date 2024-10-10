package sortingAlgorithms;

import java.util.*;

public class SelectionSort<T extends Comparable<T>> extends AbstractDataGenerator {
	// Selection sort for a list
    public void selectionSortArray(List<T> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the list
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            if (minIndex != i) {
                T temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        }
    }
    
    // Definition for singly-linked list node
    @SuppressWarnings("hiding")
	class Node<T extends Comparable<T>> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert List<T> to a linked list and perform selection sort
    public void selectionSortLinked(List<T> list) {
        if (list == null || list.isEmpty()) return;

        // Convert the List<T> to a linked list
        Node<T> head = new Node<>(list.get(0));
        Node<T> current = head;
        for (int i = 1; i < list.size(); i++) {
            current.next = new Node<>(list.get(i));
            current = current.next;
        }

        // Perform selection sort on the linked list
        Node<T> temp = head;

        while (temp != null) {
            Node<T> min = temp;
            Node<T> r = temp.next;

            while (r != null) {
                if (min.data.compareTo(r.data) > 0) {
                    min = r;
                }
                r = r.next;
            }

            // Swap Data 
            T x = temp.data;
            temp.data = min.data;
            min.data = x;

            temp = temp.next;
        }

        // Convert the sorted linked list back to the List<T>
        current = head;
        int index = 0;
        while (current != null) {
            list.set(index++, current.data);
            current = current.next;
        }
    }
}
