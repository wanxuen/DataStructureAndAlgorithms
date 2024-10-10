package sortingAlgorithms;

import java.util.*;
import java.io.*;
import sortingAlgorithms.AbstractDataGenerator.Node;

public class TimSortTest {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter outputFile = new PrintWriter("TimSortResult.txt");
		
		TimSort<String> strTimSort = new TimSort<String>();
		int[] strSizeList = {10000, 30000, 50000, 70000, 90000, 100000, 300000, 500000};
		
		
		TimSort<Integer> intNumTimSort = new TimSort<Integer>();
		TimSort<Double> doubleNumTimSort = new TimSort<Double>();
		int[] numSizeAList = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000, 7000000, 10000000};
		int[] numSizeLList = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000, 7000000, 10000000};
		int[] numList = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000};
		
		// Benchmarking TimSort on varying sizes of String ArrayList
		for(int i:strSizeList) {
			List<String> strList = strTimSort.getStringList(i);
			long startTime = System.currentTimeMillis();
			strTimSort.timSortA(strList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K random Strings ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of sorted String ArrayList
		for(int i:strSizeList) {
			List<String> sortedStrList = strTimSort.getSortedStringList(i);
			long startTime = System.currentTimeMillis();
			strTimSort.timSortA(sortedStrList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K sorted Strings ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of reversed String ArrayList
		for(int i:strSizeList) {
			ArrayList<String> reversedStrList = strTimSort.getReversedStringList(i);
			long startTime = System.currentTimeMillis();
			strTimSort.timSortA(reversedStrList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K reversed Strings ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of nearly sorted String ArrayList
		for(int i:strSizeList) {
			ArrayList<String> nearlySortedStrList = strTimSort.getNearlySortedStringList(i);
			long startTime = System.currentTimeMillis();
			strTimSort.timSortA(nearlySortedStrList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K nearly sorted Strings ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of duplicate String ArrayList
		for(int i:strSizeList) {
			ArrayList<String> duplicateStrList = strTimSort.getDuplicateStringList(i);
			long startTime = System.currentTimeMillis();
			strTimSort.timSortA(duplicateStrList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K Strings ArrayList contains duplicates: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of upper case String ArrayList
		for(int i:strSizeList) {
			ArrayList<String> upStrList = strTimSort.getUpperCaseStringList(i);
			long startTime = System.currentTimeMillis();
			strTimSort.timSortA(upStrList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K Upper Case Strings ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of lower case String ArrayList
		for(int i:strSizeList) {
			ArrayList<String> lowStrList = strTimSort.getLowerCaseStringList(i);
			long startTime = System.currentTimeMillis();
			strTimSort.timSortA(lowStrList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K Lower Case Strings ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of random Number ArrayList
		for(int i:numSizeAList) {
			ArrayList<Integer> numArrayList = intNumTimSort.getNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(numArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K random Number ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of random Number LinkedList
		for(int i:numSizeLList) {
			LinkedList<Integer> numLinkedList = intNumTimSort.getNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(numLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K random Number LinkedList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of sorted Number ArrayList
		for(int i:numSizeAList) {
			ArrayList<Integer> sortedNumArrayList = intNumTimSort.getSortedNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(sortedNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K sorted Number ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of sorted Number LinkedList
		for(int i:numSizeLList) {
			LinkedList<Integer> sortedNumLinkedList = intNumTimSort.getSortedNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(sortedNumLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K sorted Number LinkedList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of reversed Number ArrayList
		for(int i:numSizeAList) {
			ArrayList<Integer> rNumArrayList = intNumTimSort.getReversedNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(rNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K reversed Number ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of reversed Number LinkedList
		for(int i:numSizeLList) {
			LinkedList<Integer> rNumLinkedList = intNumTimSort.getReversedNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(rNumLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K reversed Number LinkedList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of nearly sorted Number ArrayList
		for(int i:numSizeAList) {
			ArrayList<Integer> nsNumArrayList = intNumTimSort.getNearlySortedNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(nsNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K nearly sorted Number ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of nearly sorted Number LinkedList
		for(int i:numSizeLList) {
			LinkedList<Integer> nsNumLinkedList = intNumTimSort.getNearlySortedNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(nsNumLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K nearly sorted Number LinkedList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of duplicate Number ArrayList
		for(int i:numSizeAList) {
			ArrayList<Integer> dupNumArrayList = intNumTimSort.getDuplicateNumArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(dupNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K Number ArrayList contains duplicates: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of duplicate Number LinkedList
		for(int i:numSizeLList) {
			LinkedList<Integer> dupNumLinkedList = intNumTimSort.getDuplicateNumLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(dupNumLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K Number LinkedList contains duplicates: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of outlier Number ArrayList
		for(int i:numSizeAList) {
			ArrayList<Integer> outNumArrayList = intNumTimSort.getOutliersArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(outNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K Number ArrayList contains outliers: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of outlier Number LinkedList
		for(int i:numSizeLList) {
			LinkedList<Integer> outNumLinkedList = intNumTimSort.getOutliersLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(outNumLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K Number LinkedList contains outliers: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of skewed Number ArrayList
		for(int i:numList) {
			ArrayList<Integer> skewedNumArrayList = intNumTimSort.getSkewedArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(skewedNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K skewed Number ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of skewed Number LinkedList
		for(int i:numList) {
			LinkedList<Integer> skewedNumLinkedList = intNumTimSort.getSkewedLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(skewedNumLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K skewed Number LinkedList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of negative Number ArrayList
		for(int i:numSizeAList) {
			ArrayList<Integer> negNumArrayList = intNumTimSort.getNegativeNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(negNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K negative Number ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of negative Number LinkedList
		for(int i:numSizeLList) {
			LinkedList<Integer> negNumLinkedList = intNumTimSort.getNegativeNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(negNumLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K negative Number LinkedList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of even Number ArrayList
		for(int i:numList) {
			ArrayList<Integer> evenNumArrayList = intNumTimSort.getEvenNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(evenNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K even Number ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of even Number LinkedList
		for(int i:numList) {
			LinkedList<Integer> evenNumLinkedList = intNumTimSort.getEvenNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(evenNumLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K even Number LinkedList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of odd Number ArrayList
		for(int i:numList) {
			ArrayList<Integer> oddNumArrayList = intNumTimSort.getOddNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortA(oddNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K odd Number ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of odd Number LinkedList
		for(int i:numList) {
			LinkedList<Integer> oddNumLinkedList = intNumTimSort.getOddNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(oddNumLinkedList);
			long startTime = System.currentTimeMillis();
			intNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K odd Number LinkedList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of Double Number ArrayList
		for(int i:numSizeAList) {
			ArrayList<Double> doubleNumArrayList = doubleNumTimSort.getDoubleNumberArrayList(i);
			long startTime = System.currentTimeMillis();
			doubleNumTimSort.timSortA(doubleNumArrayList);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K Double Number ArrayList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of Double Number LinkedList
		for(int i:numSizeLList) {
			LinkedList<Double> doubleNumLinkedList = doubleNumTimSort.getDoubleNumberLinkedList(i);
			Node<Double> head = doubleNumTimSort.convertToNodeList(doubleNumLinkedList);
			long startTime = System.currentTimeMillis();
			doubleNumTimSort.timSortL(head);
	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        outputFile.println((duration));
	        System.out.println("Elapsed time of " + i/1000 + "K Double Number LinkedList: " + duration + " ms");
		}
		outputFile.println();
		System.out.println();
		
		outputFile.close(); // Close the outputFile
	}
}
