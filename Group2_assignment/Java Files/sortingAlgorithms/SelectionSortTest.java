package sortingAlgorithms;

import java.io.*;
import java.util.*;

public class SelectionSortTest {
	public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("SelectionSortResult.txt");

        SelectionSort<String> strSelectionSort = new SelectionSort<String>();
        int[] strSizeList = {10000, 30000, 50000, 70000, 90000, 100000, 300000, 500000};

        SelectionSort<Integer> numSelectionSort = new SelectionSort<Integer>();
        SelectionSort<Double> doubleNumSelectionSort = new SelectionSort<Double>();
        int[] numSizeAList = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000, 7000000, 10000000};
        int[] numSizeLList = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000, 7000000, 10000000};
        int[] numSizeAList2 = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000};
        int[] numSizeLList2 = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000};
        
        
        // Benchmarking Random Strings - ArrayList
        for (int i : strSizeList) {
            List<String> strList = strSelectionSort.getStringList(i);
            long startTime = System.currentTimeMillis();
            strSelectionSort.selectionSortArray(strList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K random Strings ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Sorted Strings - ArrayList
        for (int i : strSizeList) {
            List<String> sortedStrList = strSelectionSort.getSortedStringList(i);
            long startTime = System.currentTimeMillis();
            strSelectionSort.selectionSortArray(sortedStrList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K sorted Strings ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Reversed Strings - ArrayList
        for (int i : strSizeList) {
            ArrayList<String> reversedStrList = strSelectionSort.getReversedStringList(i);
            long startTime = System.currentTimeMillis();
            strSelectionSort.selectionSortArray(reversedStrList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K reversed Strings ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Nearly Sorted Strings - ArrayList
        for (int i : strSizeList) {
            ArrayList<String> nearlySortedStrList = strSelectionSort.getNearlySortedStringList(i);
            long startTime = System.currentTimeMillis();
            strSelectionSort.selectionSortArray(nearlySortedStrList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K nearly sorted Strings ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();
        
        // Benchmarking Duplicate Strings - ArrayList
        for (int i : strSizeList) {
            ArrayList<String> duplicateStrList = strSelectionSort.getDuplicateStringList(i);
            long startTime = System.currentTimeMillis();
            strSelectionSort.selectionSortArray(duplicateStrList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K Strings ArrayList contains duplicates: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();
        
     // Benchmarking Upper Case Strings - ArrayList
      for (int i : strSizeList) {
          ArrayList<String> upperCaseStrList = strSelectionSort.getUpperCaseStringList(i);
          long startTime = System.currentTimeMillis();
          strSelectionSort.selectionSortArray(upperCaseStrList);
          long endTime = System.currentTimeMillis();
          long duration = endTime - startTime;
          outputFile.println(duration);
          System.out.println("Elapsed time of " + i / 1000 + "K Upper Case Strings ArrayList: " + duration + " ms");
      }

      outputFile.println();
      System.out.println();
        
      
      // Benchmarking Lower Case Strings - ArrayList
      for (int i : strSizeList) {
          ArrayList<String> lowerCaseStrList = strSelectionSort.getLowerCaseStringList(i);
          long startTime = System.currentTimeMillis();
          strSelectionSort.selectionSortArray(lowerCaseStrList);
          long endTime = System.currentTimeMillis();
          long duration = endTime - startTime;
          outputFile.println(duration);
          System.out.println("Elapsed time of " + i / 1000 + "K Lower Case Strings ArrayList: " + duration + " ms");
      }

      outputFile.println();
      System.out.println();


        // Benchmarking Random Numbers - ArrayList
        for (int i : numSizeAList) {
            ArrayList<Integer> numArrayList = numSelectionSort.getNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortArray(numArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K random Number ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Random Numbers - LinkedList
        for (int i : numSizeLList) {
            LinkedList<Integer> numLinkedList = numSelectionSort.getNumberLinkedList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortLinked(numLinkedList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K random Number LinkedList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Sorted Numbers - ArrayList
        for (int i : numSizeAList) {
            ArrayList<Integer> sortedNumArrayList = numSelectionSort.getSortedNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortArray(sortedNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K sorted Number ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Sorted Numbers - LinkedList
        for (int i : numSizeLList) {
            LinkedList<Integer> sortedNumLinkedList = numSelectionSort.getSortedNumberLinkedList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortLinked(sortedNumLinkedList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K sorted Number LinkedList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

         //Benchmarking Reversed Numbers - ArrayList
        for (int i : numSizeAList) {
            ArrayList<Integer> rNumArrayList = numSelectionSort.getReversedNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortArray(rNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K reversed Number ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Reversed Numbers - LinkedList
        for (int i : numSizeLList) {
            LinkedList<Integer> rNumLinkedList = numSelectionSort.getReversedNumberLinkedList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortLinked(rNumLinkedList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K reversed Number LinkedList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Nearly Sorted Numbers - ArrayList
        for (int i : numSizeAList) {
            ArrayList<Integer> nsNumArrayList = numSelectionSort.getNearlySortedNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortArray(nsNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K nearly sorted Number ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Nearly Sorted Numbers - LinkedList
        for (int i : numSizeLList) {
            LinkedList<Integer> nsNumLinkedList = numSelectionSort.getNearlySortedNumberLinkedList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortLinked(nsNumLinkedList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K nearly sorted Number LinkedList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Duplicate Numbers - ArrayList
        for (int i : numSizeAList) {
            ArrayList<Integer> dNumArrayList = numSelectionSort.getDuplicateNumArrayList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortArray(dNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K duplicate Number ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Duplicate Numbers - LinkedList
        for (int i : numSizeLList) {
            LinkedList<Integer> dNumLinkedList = numSelectionSort.getDuplicateNumLinkedList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortLinked(dNumLinkedList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K duplicate Number LinkedList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Outliers Numbers - ArrayList
        for (int i : numSizeAList) {
            ArrayList<Integer> outlierNumArrayList = numSelectionSort.getOutliersArrayList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortArray(outlierNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K outliers Number ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Outliers Numbers - LinkedList
        for (int i : numSizeLList) {
            LinkedList<Integer> outlierNumLinkedList = numSelectionSort.getOutliersLinkedList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortLinked(outlierNumLinkedList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K outliers Number LinkedList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Skewed Numbers - ArrayList
        for (int i : numSizeAList2) {
            ArrayList<Integer> skewedNumArrayList = numSelectionSort.getSkewedArrayList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortArray(skewedNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K skewed Number ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Skewed Numbers - LinkedList
        for (int i : numSizeLList2) {
            LinkedList<Integer> skewedNumLinkedList = numSelectionSort.getSkewedLinkedList(i);
            long startTime = System.currentTimeMillis();
            numSelectionSort.selectionSortLinked(skewedNumLinkedList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K skewed Number LinkedList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        
      // Benchmarking Negative Numbers - ArrayList
      for (int i : numSizeAList) {
          ArrayList<Integer> negNumArrayList = numSelectionSort.getNegativeNumberArrayList(i);
          long startTime = System.currentTimeMillis();
          numSelectionSort.selectionSortArray(negNumArrayList);
          long endTime = System.currentTimeMillis();
          long duration = endTime - startTime;
          outputFile.println(duration);
          System.out.println("Elapsed time of " + i / 1000 + "K negative Number ArrayList: " + duration + " ms");
      }

      outputFile.println();
      System.out.println();

      // Benchmarking Negative Numbers - LinkedList
      for (int i : numSizeLList) {
          LinkedList<Integer> negNumLinkedList = numSelectionSort.getNegativeNumberLinkedList(i);
          long startTime = System.currentTimeMillis();
          numSelectionSort.selectionSortLinked(negNumLinkedList);
          long endTime = System.currentTimeMillis();
          long duration = endTime - startTime;
          outputFile.println(duration);
          System.out.println("Elapsed time of " + i / 1000 + "K negative Number LinkedList: " + duration + " ms");
      }

      outputFile.println();
      System.out.println();

        
      // Benchmarking Even Numbers - ArrayList
      for (int i : numSizeAList2) {
          ArrayList<Integer> evenNumArrayList = numSelectionSort.getEvenNumberArrayList(i);
          long startTime = System.currentTimeMillis();
          numSelectionSort.selectionSortArray(evenNumArrayList);
          long endTime = System.currentTimeMillis();
          long duration = endTime - startTime;
          outputFile.println(duration);
          System.out.println("Elapsed time of " + i / 1000 + "K even Number ArrayList: " + duration + " ms");
      }

      outputFile.println();
      System.out.println();

      // Benchmarking Even Numbers - LinkedList
      for (int i : numSizeLList2) {
          LinkedList<Integer> evenNumLinkedList = numSelectionSort.getEvenNumberLinkedList(i);
          long startTime = System.currentTimeMillis();
          numSelectionSort.selectionSortLinked(evenNumLinkedList);
          long endTime = System.currentTimeMillis();
          long duration = endTime - startTime;
          outputFile.println(duration);
          System.out.println("Elapsed time of " + i / 1000 + "K even Number LinkedList: " + duration + " ms");
      }

      outputFile.println();
      System.out.println();
        
      
      
      
      
      // Benchmarking Odd Numbers - ArrayList
      for (int i : numSizeAList2) {
          ArrayList<Integer> oddNumArrayList = numSelectionSort.getOddNumberArrayList(i);
          long startTime = System.currentTimeMillis();
          numSelectionSort.selectionSortArray(oddNumArrayList);
          long endTime = System.currentTimeMillis();
          long duration = endTime - startTime;
          outputFile.println(duration);
          System.out.println("Elapsed time of " + i / 1000 + "K odd Number ArrayList: " + duration + " ms");
      }

      outputFile.println();
      System.out.println();

      
      // Benchmarking Odd Numbers - LinkedList
      for (int i : numSizeLList2) {
          LinkedList<Integer> oddNumLinkedList = numSelectionSort.getOddNumberLinkedList(i);
          long startTime = System.currentTimeMillis();
          numSelectionSort.selectionSortLinked(oddNumLinkedList);
          long endTime = System.currentTimeMillis();
          long duration = endTime - startTime;
          outputFile.println(duration);
          System.out.println("Elapsed time of " + i / 1000 + "K odd Number LinkedList: " + duration + " ms");
      }

      outputFile.println();
      System.out.println();
        
        
        // Benchmarking Double Numbers - ArrayList
        for (int i : numSizeAList) {
            ArrayList<Double> doubleNumArrayList = doubleNumSelectionSort.getDoubleNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            doubleNumSelectionSort.selectionSortArray(doubleNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K double Number ArrayList: " + duration + " ms");
        }

        outputFile.println();
        System.out.println();

        // Benchmarking Double Numbers - LinkedList
        for (int i : numSizeLList) {
            LinkedList<Double> doubleNumLinkedList = doubleNumSelectionSort.getDoubleNumberLinkedList(i);
            long startTime = System.currentTimeMillis();
            doubleNumSelectionSort.selectionSortLinked(doubleNumLinkedList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println(duration);
            System.out.println("Elapsed time of " + i / 1000 + "K double Number LinkedList: " + duration + " ms");
        }

        outputFile.println();
        outputFile.close(); // Close the outputFile
    }

}
