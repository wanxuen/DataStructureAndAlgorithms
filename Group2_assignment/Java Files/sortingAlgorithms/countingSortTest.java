package sortingAlgorithms;

import java.util.*;
import java.io.*;

public class countingSortTest {
	public static void main(String[] args) throws FileNotFoundException{
		PrintWriter outputFile=new PrintWriter("CountingSortResult.txt");
		countingSort countingSort = new countingSort();
		
		//Fix size for numbers
		int[] sizeNumList = {10000,30000,50000,70000,100000,300000,500000,700000,1000000,3000000,5000000,7000000,10000000};
		int[] sizeNumList2 = {10000,30000,50000,70000,100000,300000,500000,700000,1000000,3000000,5000000};
		
		//Fix size for String
		int[] sizeStringList = {10000,30000,50000,70000,90000,100000,300000,500000};
		
		// Test for random Strings
		for(int i:sizeStringList) {
			List<String> strList = countingSort.getStringList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortString(strList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K random Strings sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for sorted ascending String 
		for(int i:sizeStringList) {
			List<String> strSortedList = countingSort.getSortedStringList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortString(strSortedList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K sorted Strings sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println(); 
		
		// Test for Reversed Strings
		for(int i:sizeStringList) {
			List<String> strReversedList = countingSort.getReversedStringList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortString(strReversedList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K reversed Strings sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();	
		
		// Test for Nearly Sorted Strings
		for(int i:sizeStringList) {
			List<String> strNSList = countingSort.getNearlySortedStringList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortString(strNSList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K nearly sorted Strings sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Test for Duplicate Strings
		for(int i:sizeStringList) {
			List<String> strDList = countingSort.getDuplicateStringList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortString(strDList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K duplicate Strings sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();	

		// Test for upper case Strings
		for(int i:sizeStringList) {
			List<String> strUpperList = countingSort.getUpperCaseStringList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortString(strUpperList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K upper case Strings sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();				
				
		// Test for lower case Strings
		for(int i:sizeStringList) {
			List<String> strLowerList = countingSort.getLowerCaseStringList(i);			
			long startTime = System.currentTimeMillis();
			countingSort.countingSortString(strLowerList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K lower case Strings sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for random number ArrayList 
		for(int i:sizeNumList) {
			List<Integer> numArrayList = countingSort.getNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K random number ArrayList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Test for random number LinkedList
        for (int i : sizeNumList) {
            List<Integer> numLinkedList = countingSort.getNumberLinkedList(i);
            
            // Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numNode = createNodeLinkedList(numLinkedList);
            
            long startTime = System.currentTimeMillis();
            countingSort.countingSortLinkedNumber(numNode);
            long endTime = System.currentTimeMillis();
            long duration = endTime-startTime;
	        outputFile.println(duration);
            
            System.out.println(i / 1000 + "K random number LinkedList sorting time: " + duration + " ms");
        }
        outputFile.println();
		System.out.println();
		
		//Test for sorted ascending number ArrayList
		for(int i:sizeNumList) {
			List<Integer> numSortedArrayList = countingSort.getSortedNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numSortedArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);        
	        System.out.println(i/1000 + "K sorted number ArrayList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for sorted ascending number LinkedList
		for(int i:sizeNumList) {
			List<Integer> numSortedLinkedList = countingSort.getSortedNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numSortedNode = createNodeLinkedList(numSortedLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numSortedNode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        
	        System.out.println(i/1000 + "K sorted number LinkedList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println(); 				

		//Test for reversed number ArrayList 
		for(int i:sizeNumList) {
			List<Integer> numRArrayList = countingSort.getReversedNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numRArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K reversed number ArrayList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for reversed number LinkedList
		for(int i:sizeNumList) {
			List<Integer> numRLinkedList = countingSort.getReversedNumberLinkedList(i);

			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numRNode = createNodeLinkedList(numRLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numRNode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K reversed number LinkedList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
				
		//Test for nearly sorted number ArrayList 
		for(int i:sizeNumList) {
			List<Integer> numNSArrayList = countingSort.getNearlySortedNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numNSArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K nearly sorted number ArrayList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for nearly sorted number LinkedList
		for(int i:sizeNumList) {
			List<Integer> numNSLinkedList = countingSort.getNearlySortedNumberLinkedList(i);

			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numNSNode = createNodeLinkedList(numNSLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numNSNode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K nearly sorted number LinkedList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();				

		//Test for duplicate number ArrayList 
		for(int i:sizeNumList) {
			List<Integer> numDArrayList = countingSort.getDuplicateNumArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numDArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K duplicate number ArrayList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for duplicate number LinkedList
		for(int i:sizeNumList) {
			List<Integer> numDLinkedList = countingSort.getDuplicateNumLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numDNode = createNodeLinkedList(numDLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numDNode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K duplicate number LinkedList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for outliers number ArrayList 
		for(int i:sizeNumList) {
			List<Integer> numOArrayList = countingSort.getOutliersArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numOArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K number ArrayList contains outliers sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();	
		
		//Test for outliers number LinkedList
		for(int i:sizeNumList) {
			List<Integer> numOLinkedList = countingSort.getOutliersLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numONode = createNodeLinkedList(numOLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numONode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K number LinkedList contains outliers sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();		

		//Test for skewed number ArrayList
		for(int i:sizeNumList2) {
			List<Integer> numSkewedArrayList = countingSort.getSkewedArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numSkewedArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K number ArrayList contains skewed sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for skewed number LinkedList
		for(int i:sizeNumList2) {
			List<Integer> numSkewedLinkedList = countingSort.getSkewedLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numSkewedNode = createNodeLinkedList(numSkewedLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numSkewedNode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K number LinkedList contains skewed sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();				
				
		//Test for negative number ArrayList
		for(int i:sizeNumList) {
			List<Integer> numNegativeArrayList = countingSort.getNegativeNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numNegativeArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K negative number ArrayList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for negative number LinkedList
		for(int i:sizeNumList) {
			List<Integer> numNegativeLinkedList = countingSort.getNegativeNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numNegativeNode = createNodeLinkedList(numNegativeLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numNegativeNode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K negative number LinkedList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for even number ArrayList
		for(int i:sizeNumList2) {
			List<Integer> numEvenArrayList = countingSort.getEvenNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numEvenArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K even number ArrayList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for even number LinkedList
		for(int i:sizeNumList2) {
			List<Integer> numEvenLinkedList = countingSort.getEvenNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numEvenNode = createNodeLinkedList(numEvenLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numEvenNode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K even number LinkedList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();				
				
		//Test for odd number ArrayList
		for(int i:sizeNumList2) {
			List<Integer> numOddArrayList = countingSort.getOddNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortNumber(numOddArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K odd number ArrayList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		//Test for odd number LinkedList
		for(int i:sizeNumList2) {
			List<Integer> numOddLinkedList = countingSort.getOddNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numOddNode = createNodeLinkedList(numOddLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numOddNode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K odd number LinkedList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();						
		
		//Test for double number ArrayList 
		for(int i:sizeNumList) {
			List<Double> numDoArrayList = countingSort.getDoubleNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			countingSort.countingSortDoubleNumber(numDoArrayList,0,99999.0);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K double number ArrayList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
			
		//Test for double number LinkedList
		for(int i:sizeNumList) {
			List<Double> numDoLinkedList = countingSort.getDoubleNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Double> numDoubleNode = createNodeLinkedList(numDoLinkedList);
            
			long startTime = System.currentTimeMillis();
			countingSort.countingSortLinkedNumber(numDoubleNode);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime-startTime;
	        outputFile.println(duration);
	        System.out.println(i/1000 + "K double number LinkedList sorting time: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		outputFile.close();
	}	
	
	// Convert List to Node-based LinkedList
	private static <T extends Number> countingSort.Node<T> createNodeLinkedList(List<T> list) {
	    countingSort countingSort = new countingSort();
	    countingSort.Node<T> head = null;
	    countingSort.Node<T> tail = null;

	    for (T num : list) {
	        countingSort.Node<T> newNode = countingSort.new Node<>(num);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }
	    return head;
	}
}
