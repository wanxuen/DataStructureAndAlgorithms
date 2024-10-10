package sortingAlgorithms;

import java.util.*;

public class countingSort extends AbstractDataGenerator{
	public countingSort() {
		super();
	}
	
	public void countingSortString(List<String> list) {
        int size = list.size();
        if (size <= 0) return;

        // Find the maximum character (based on ASCII value) in the list
        char maxChar = list.get(0).charAt(0);
        for (String s : list) {
            if (s.charAt(0) > maxChar) {
                maxChar = s.charAt(0);
            }
        }
        
        int maxInt = (int) maxChar;
        int[] count = new int[maxInt + 1];
        String[] output = new String[size];
        
        for (String s : list) {
            count[s.charAt(0)]++;
        }
        
        for (int i = 1; i <= maxInt; i++) {
            count[i] += count[i - 1];
        }
     
        for (int i = size - 1; i >= 0; i--) {
            char c = list.get(i).charAt(0);
            output[count[c] - 1] = list.get(i);
            count[c]--;
        }
        
        // Copy sorted elements back to the original list
        for (int i = 0; i < size; i++) {
            list.set(i, output[i]);
        }
	}
	
	public void countingSortNumber(List<Integer> list) {
	    int size = list.size();
	    if (size <= 0) return;
	    
	    // Find the largest and smallest elements 
	    int min = list.get(0);
	    int max = list.get(0);
	    for (int i = 1; i < size; i++) {
	        if (list.get(i) < min) {
	            min = list.get(i);
	        }
	        if (list.get(i) > max) {
	            max = list.get(i);
	        }
	    }

	    int range = max - min + 1;
	    int[] count = new int[range];

	    for (int i = 0; i < size; i++) {
	        count[list.get(i) - min]++;
	    }

	    for (int i = 1; i < range; i++) {
	        count[i] += count[i - 1];
	    }
	    int[] output = new int[size];

	    // Sort the elements
	    for (int i = size - 1; i >= 0; i--) {
	        output[count[list.get(i) - min] - 1] = list.get(i);
	        count[list.get(i) - min]--;
	    }

	    // Copy the sorted elements back to the original list
	    for (int i = 0; i < size; i++) {
	        list.set(i, output[i]);
	    }
	}
	
	public void countingSortDoubleNumber(List<Double> list, double minRange, double maxRange) {
	    int size = list.size();
	    if (size <= 0) return;

	    // Scale factor to convert doubles to integers
	    int scaleFactor = 1000;

	    List<Integer> scaledList = new ArrayList<>();

	    // To handle out of range problem
	    for (double num : list) {
	        if (num < minRange) {
	            num = minRange;
	        } else if (num > maxRange) {
	            num = maxRange; 
	        }
	        int scaledNum = (int) (num * scaleFactor);
	        scaledList.add(scaledNum);
	    }

	    int scaledMin = (int) (minRange * scaleFactor);
	    int scaledMax = (int) (maxRange * scaleFactor);
	    int range = scaledMax - scaledMin + 1;

	    int[] count = new int[range];

	    for (int scaledNum : scaledList) {
	        count[scaledNum - scaledMin]++;
	    }

	    for (int i = 1; i < range; i++) {
	        count[i] += count[i - 1];
	    }

	    int[] output = new int[size];
	    for (int i = size - 1; i >= 0; i--) {
	        int scaledNum = scaledList.get(i);
	        output[count[scaledNum - scaledMin] - 1] = scaledNum;
	        count[scaledNum - scaledMin]--;
	    }

	    for (int i = 0; i < size; i++) {
	        list.set(i, output[i] / (double) scaleFactor);
	    }
	}

	// Method to sort LinkedList using Node-based structure 
	public <T extends Number & Comparable<T>> void countingSortLinkedNumber(Node<T> head) {
	    if (head == null) return;

	    // Check whether is double or integer
	    boolean isDouble = head.data instanceof Double;

	    // Find the largest and smallest elements
	    T min = head.data;
	    T max = head.data;
	    Node<T> current = head;

	    while (current != null) {
	        if (current.data.compareTo(min) < 0) min = current.data;
	        if (current.data.compareTo(max) > 0) max = current.data;
	        current = current.next;
	    }
	    
	    // Scaling factor to convert doubles to integers
	    int scaleFactor = isDouble ? 1000 : 1;  

	    int minInt = (int) (min.doubleValue() * scaleFactor);
	    int maxInt = (int) (max.doubleValue() * scaleFactor);
	    int range = maxInt - minInt + 1;

	    int[] count = new int[range];

	    current = head;
	    while (current != null) {
	        int valueInt = (int) (current.data.doubleValue() * scaleFactor);
	        count[valueInt - minInt]++;
	        current = current.next;
	    }

	    for (int i = 1; i < range; i++) {
	        count[i] += count[i - 1];
	    }

	    Node<T> outputHead = null;
	    Node<T> outputTail = null;

	    current = head;
	    while (current != null) {
	        int valueInt = (int) (current.data.doubleValue() * scaleFactor);
	        int pos = count[valueInt - minInt] - 1;
	        count[valueInt - minInt]--;

	        T sortedValue = isDouble ? (T) Double.valueOf((valueInt + minInt) / (double) scaleFactor) : (T) Integer.valueOf(valueInt + minInt);

	        Node<T> newNode = new Node<>(sortedValue);
	        if (outputHead == null) {
	            outputHead = newNode;
	            outputTail = newNode;
	        } else {
	            outputTail.next = newNode;
	            outputTail = newNode;
	        }

	        current = current.next;
	    }

	    // Copy the sorted linked list back to the original linked list
	    current = head;
	    Node<T> sortedCurrent = outputHead;
	    while (current != null) {
	        current.data = sortedCurrent.data;
	        current = current.next;
	        sortedCurrent = sortedCurrent.next;
	    }
	}

}
