package sortingAlgorithms;

import java.io.*;
import java.util.*;

public class MergeSortTest {
	
	public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter outputFile = new PrintWriter("MergeSortResult.txt");
        
        MergeSort<String> strMergeSort = new MergeSort<String>();
        int[] strSizeList = {10000, 30000, 50000, 70000, 90000, 100000, 300000, 500000};
                   
        MergeSort<Integer> numMergeSort = new MergeSort<Integer>();
        MergeSort<Double> doubleNumMergeSort = new MergeSort<Double>();
        int[] numSizeAList = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000, 7000000, 10000000};
        int[] numSizeLList = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000, 7000000, 10000000};
        int[] numSizeListmax5M = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000};
        
        // 1. Test for random Strings
        for(int i:strSizeList) {
            List<String> strList = strMergeSort.getStringList(i);
            long startTime = System.currentTimeMillis();
            strMergeSort.mergeSort(strList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K random Strings ArrayList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 2. Test for sorted ascending String 
        for(int i:strSizeList) {
            List<String> sortedStrList = strMergeSort.getSortedStringList(i);
            long startTime = System.currentTimeMillis();
            strMergeSort.mergeSort(sortedStrList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K sorted Strings ArrayList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 3. Test for Reversed Strings
        for(int i:strSizeList) {
            ArrayList<String> reversedStrList = strMergeSort.getReversedStringList(i);
            long startTime = System.currentTimeMillis();
            strMergeSort.mergeSort(reversedStrList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K reversed Strings ArrayList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 4. Test for Nearly Sorted Strings
        for(int i:strSizeList) {
            ArrayList<String> nearlySortedStrList = strMergeSort.getNearlySortedStringList(i);
            long startTime = System.currentTimeMillis();
            strMergeSort.mergeSort(nearlySortedStrList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K nearly sorted Strings ArrayList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 5. Test for Duplicate Strings
        for(int i:strSizeList) {
            ArrayList<String> duplicateStrList = strMergeSort.getDuplicateStringList(i);
            long startTime = System.currentTimeMillis();
            strMergeSort.mergeSort(duplicateStrList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K Strings ArrayList contains duplicates: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 6. Test for upper case Strings
 		for(int i:strSizeList) {
 			List<String> strUpperList = strMergeSort.getUpperCaseStringList(i);
 			long startTime = System.currentTimeMillis();
 			strMergeSort.mergeSort(strUpperList);
 	        long endTime = System.currentTimeMillis();
 	       long duration = endTime - startTime;
 	        System.out.println(i/1000 + "K upper case Strings sorting time: " + duration + " ms");
 	        outputFile.println((duration));
 		}
 		outputFile.println();
 		System.out.println();				
 				
 		// 7. Test for lower case Strings
 		for(int i:strSizeList) {
 			List<String> strLowerList = strMergeSort.getLowerCaseStringList(i);
 			long startTime = System.currentTimeMillis();
 			strMergeSort.mergeSort(strLowerList);
 	        long endTime = System.currentTimeMillis();
 	       long duration = endTime - startTime;
 	        System.out.println(i/1000 + "K upper case Strings sorting time: " + duration + " ms");
 	       outputFile.println((duration));
 		}
 		outputFile.println();
 		System.out.println();	
 		
 		// 8. Test for random number ArrayList 
        for(int i:numSizeAList) {
            ArrayList<Integer> numArrayList = numMergeSort.getNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numMergeSort.mergeSort(numArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K random Number ArrayList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 9. Test for random number LinkedList
        for(int i:numSizeLList) {
            LinkedList<Integer> numLinkedList = numMergeSort.getNumberLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(numLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K random Number LinkedList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 10. Test for sorted ascending number ArrayList
        for(int i:numSizeAList) {
            ArrayList<Integer> sortedNumArrayList = numMergeSort.getSortedNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numMergeSort.mergeSort(sortedNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K sorted Number ArrayList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 11. Test for sorted ascending number LinkedList
        for(int i:numSizeLList) {
            LinkedList<Integer> sortedNumLinkedList = numMergeSort.getSortedNumberLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(sortedNumLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K sorted Number LinkedList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();

        // 12. Test for reversed number ArrayList
        for(int i:numSizeAList) {
            ArrayList<Integer> rNumArrayList = numMergeSort.getReversedNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numMergeSort.mergeSort(rNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K reversed Number ArrayList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 13. Test for reversed number LinkedList
        for(int i:numSizeLList) {
            LinkedList<Integer> rNumLinkedList = numMergeSort.getReversedNumberLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(rNumLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K reversed Number LinkedList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();

        // 14. Test for nearly sorted number ArrayList 
        for(int i:numSizeAList) {
            ArrayList<Integer> nsNumArrayList = numMergeSort.getNearlySortedNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numMergeSort.mergeSort(nsNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K nearly sorted Number ArrayList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 15. Test for nearly sorted number LinkedList
        for(int i:numSizeLList) {
            LinkedList<Integer> nsNumLinkedList = numMergeSort.getNearlySortedNumberLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(nsNumLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K nearly sorted Number LinkedList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
		
        // 16. Test for duplicate number ArrayList 
        for(int i:numSizeAList) {
            ArrayList<Integer> dupNumArrayList = numMergeSort.getDuplicateNumArrayList(i);
            long startTime = System.currentTimeMillis();
            numMergeSort.mergeSort(dupNumArrayList);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K duplicate Number ArrayList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 17. Test for duplicate number LinkedList
         for(int i:numSizeLList) {
            LinkedList<Integer> dupNumLinkedList = numMergeSort.getDuplicateNumLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(dupNumLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            outputFile.println((duration));
            System.out.println("Elapsed time of " + i/1000 + "K duplicate Number LinkedList: " + duration + " ms");
        }
        outputFile.println();
        System.out.println();
        
        // 18. Test for outliers number ArrayList 
 		for(int i:numSizeAList) {
 			ArrayList<Integer> outNumArrayList = numMergeSort.getOutliersArrayList(i);
 			long startTime = System.currentTimeMillis();
 			numMergeSort.mergeSort(outNumArrayList);
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K Number ArrayList contains outliers: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
     		
 		// 19. Test for outliers number LinkedList
 		for(int i:numSizeLList) {
 			LinkedList<Integer> outNumLinkedList = numMergeSort.getOutliersLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(outNumLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K Number LinkedList contains outliers: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();

 		// 20. Test for skewed number ArrayList
 		for(int i:numSizeListmax5M) {
 			ArrayList<Integer> skewedNumArrayList = numMergeSort.getSkewedArrayList(i);
 			long startTime = System.currentTimeMillis();
 			numMergeSort.mergeSort(skewedNumArrayList);
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K skewed Number ArrayList: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
     		
 		// 21. Test for skewed number LinkedList
 		for(int i:numSizeListmax5M) {
 			LinkedList<Integer> skewedNumLinkedList = numMergeSort.getSkewedLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(skewedNumLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K skewed Number LinkedList: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
 		
 		// 22. Test for negative number ArrayList
 		for(int i:numSizeAList) {
 			ArrayList<Integer> numNegativeArrayList = numMergeSort.getNegativeNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numMergeSort.mergeSort(numNegativeArrayList); 
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K negative Number ArrayList: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
 	 		
 	 	// 21. Test for negative number LinkedList
 		for(int i:numSizeLList) {
 			LinkedList<Integer> negativeNumLinkedList = numMergeSort.getNegativeNumberLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(negativeNumLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K negative Number LinkedList: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
 		
 		// 22. Test for even number ArrayList
 		for(int i:numSizeListmax5M) {
 			ArrayList<Integer> numEvenArrayList = numMergeSort.getEvenNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numMergeSort.mergeSort(numEvenArrayList); 
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K even Number ArrayList: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
 		
 		// 23. Test for even number LinkedList
 		for(int i:numSizeListmax5M) {
 			LinkedList<Integer> numEvenLinkedList = numMergeSort.getEvenNumberLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(numEvenLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K even Number LinkedList: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
 		
 		// 24. Test for odd number ArrayList
 		for(int i:numSizeListmax5M) {
 			ArrayList<Integer> numOddArrayList = numMergeSort.getOddNumberArrayList(i);
            long startTime = System.currentTimeMillis();
            numMergeSort.mergeSort(numOddArrayList); 
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K odd Number ArrayList: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
 		
 		// 25. Test for odd number LinkedList
 		for(int i:numSizeListmax5M) {
 			LinkedList<Integer> numOddLinkedList = numMergeSort.getOddNumberLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(numOddLinkedList);
            long startTime = System.currentTimeMillis();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K odd Number LinkedList: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
 		
 		// 26. Test for double number ArrayList
 		for(int i:numSizeAList) {
 			ArrayList<Double> doubleNumArrayList = doubleNumMergeSort.getDoubleNumberArrayList(i);
 			long startTime = System.currentTimeMillis();
 			doubleNumMergeSort.mergeSort(doubleNumArrayList);
 	        long endTime = System.currentTimeMillis();
 	        long duration = endTime - startTime;
 	        outputFile.println((duration));
 	        System.out.println("Elapsed time of " + i/1000 + "K Double Number ArrayList: " + duration + " ms");
 		}
 		outputFile.println();
 		System.out.println();
 		
 		// 27. Test for double number LinkedList
 		for(int i:numSizeLList) {
 			LinkedList<Double> doubleNumLinkedList = doubleNumMergeSort.getDoubleNumberLinkedList(i);
 			MergeSort.Node<Double> head = doubleNumMergeSort.convertToNodeList(doubleNumLinkedList);
            long startTime = System.currentTimeMillis();
            head = doubleNumMergeSort.mergeSort(head); 
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
