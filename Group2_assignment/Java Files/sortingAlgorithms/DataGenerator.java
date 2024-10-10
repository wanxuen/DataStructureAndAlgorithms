package sortingAlgorithms;

import java.util.*;

public interface DataGenerator {
	// English words
	ArrayList<String> getStringList(int size);
	
	ArrayList<String> getSortedStringList(int size);
	
	ArrayList<String> getReversedStringList(int size);
	
	ArrayList<String> getNearlySortedStringList(int size);
	
	ArrayList<String> getDuplicateStringList(int size);
	
	ArrayList<String> getUpperCaseStringList(int size);

	ArrayList<String> getLowerCaseStringList(int size);
	
	// Numbers
	ArrayList<Integer> getNumberArrayList(int size);
	LinkedList<Integer> getNumberLinkedList(int size);
	
	ArrayList<Integer> getSortedNumberArrayList(int size);
	LinkedList<Integer> getSortedNumberLinkedList(int size);
	
	ArrayList<Integer> getReversedNumberArrayList(int size);
	LinkedList<Integer> getReversedNumberLinkedList(int size);
	
	ArrayList<Integer> getNearlySortedNumberArrayList(int size);
	LinkedList<Integer> getNearlySortedNumberLinkedList(int size);
	
	ArrayList<Integer> getDuplicateNumArrayList(int size);
	LinkedList<Integer> getDuplicateNumLinkedList(int size);
	
	ArrayList<Integer> getOutliersArrayList(int size);
	LinkedList<Integer> getOutliersLinkedList(int size);
	
	ArrayList<Integer> getSkewedArrayList(int size);
	LinkedList<Integer> getSkewedLinkedList(int size);
	
	ArrayList<Integer> getNegativeNumberArrayList(int size);
	LinkedList<Integer> getNegativeNumberLinkedList(int size);
	
	ArrayList<Integer> getEvenNumberArrayList(int size);
	LinkedList<Integer> getEvenNumberLinkedList(int size);
	
	ArrayList<Integer> getOddNumberArrayList(int size);
	LinkedList<Integer> getOddNumberLinkedList(int size);

	ArrayList<Double> getDoubleNumberArrayList(int size);
	LinkedList<Double> getDoubleNumberLinkedList(int size);
}
