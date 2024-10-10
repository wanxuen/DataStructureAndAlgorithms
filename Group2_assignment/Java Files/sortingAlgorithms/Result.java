package sortingAlgorithms;

import java.io.*;
import java.util.*;

public class Result {
	
	public static void main(String[] args) throws FileNotFoundException {
		List<String> resultTimSort = new ArrayList<>();
		List<String> resultSelectionSort = new ArrayList<>();
		List<String> resultCountingSort = new ArrayList<>();
		List<String> resultMergeSort = new ArrayList<>();
		
		int[] strSize = {10000, 30000, 50000, 70000, 90000, 100000, 300000, 500000}; // 8
		int[] numSizeArray = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000, 7000000, 10000000}; // 13
		int[] numSizeLinked = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000, 7000000, 10000000}; // 13
		int[] numSize = {10000, 30000, 50000, 70000, 100000, 300000, 500000, 700000, 1000000, 3000000, 5000000}; //11
		
		resultTimSort.clear();
		resultSelectionSort.clear();
		resultCountingSort.clear();
		resultMergeSort.clear();		
		Scanner inputFile1 = new Scanner(new File("CountingSortResult.txt"));
		while(inputFile1.hasNext()) {
			String time = inputFile1.nextLine();
			if(!time.isBlank()) {
				resultCountingSort.add(time.trim());
			}
		}
		inputFile1.close();
		
		Scanner inputFile2 = new Scanner(new File("MergeSortResult.txt"));
		while(inputFile2.hasNext()) {
			String time = inputFile2.nextLine();
			if(!time.isBlank()) {
				resultMergeSort.add(time.trim());
			}
		}
		inputFile2.close();
		
		Scanner inputFile3 = new Scanner(new File("SelectionSortResult.txt"));
		while(inputFile3.hasNext()) {
			String time = inputFile3.nextLine();
			if(!time.isBlank()) {
				resultSelectionSort.add(time.trim());
			}
		}
		inputFile3.close();
		
		Scanner inputFile4 = new Scanner(new File("TimSortResult.txt"));
		while(inputFile4.hasNext()) {
			String time = inputFile4.nextLine();
			if(!time.isBlank()) {
				resultTimSort.add(time.trim());
			}
		}
		inputFile4.close();
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*                 Experimental Design: Random String Array List               *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=0; i<8; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", strSize[i]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*               Experimental Design: Sorted String Array List                 *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=8; i<16; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", strSize[i-8]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*               Experimental Design: Reversed String Array List               *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=16; i<24; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", strSize[i-16]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*             Experimental Design: Nearly Sorted String Array List            *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=24; i<32; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", strSize[i-24]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*         Experimental Design: String Array List Contains Duplicates          *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=32; i<40; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", strSize[i-32]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*              Experimental Design: Upper Case String Array List              *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=40; i<48; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", strSize[i-40]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*              Experimental Design: Lower Case String Array List              *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=48; i<56; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", strSize[i-48]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*                Experimental Design: Random Number Array List                *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=56; i<69; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeArray[i-56]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*              Experimental Design: Random Number Linked List                 *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=69; i<82; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeLinked[i-69]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*               Experimental Design: Sorted Number Array List                 *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=82; i<95; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeArray[i-82]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*               Experimental Design: Sorted Number Linked List                *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=95; i<108; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeLinked[i-95]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*              Experimental Design: Reversed Number Array List                *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=108; i<121; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeArray[i-108]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*              Experimental Design: Reversed Number Linked List               *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=121; i<134; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeLinked[i-121]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*            Experimental Design: Nearly Sorted Number Array List             *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=134; i<147; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeArray[i-134]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*            Experimental Design: Nearly Sorted Number Linked List            *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=147; i<160; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeLinked[i-147]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*         Experimental Design: Number Array List Contains Duplicates          *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=160; i<173; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeArray[i-160]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*         Experimental Design: Number Linked List Contains Duplicates         *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=173; i<186; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeLinked[i-173]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*          Experimental Design: Number Array List Contains Outliers           *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=186; i<199; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeArray[i-186]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*          Experimental Design: Number Linked List Contains Outliers          *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=199; i<212; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeLinked[i-199]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*               Experimental Design: Skewed Number Array List                 *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=212; i<223; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSize[i-212]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*               Experimental Design: Skewed Number Linked List                *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=223; i<234; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSize[i-223]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*              Experimental Design: Negative Number Array List                *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=234; i<247; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeArray[i-234]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*             Experimental Design: Negative Number Linked List                *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=247; i<260; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeLinked[i-247]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*                Experimental Design: Even Number Array List                  *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=260; i<271; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSize[i-260]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*                Experimental Design: Even Number Linked List                  *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=271; i<282; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSize[i-271]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*                Experimental Design: Odd Number Array List                  *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=282; i<293; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSize[i-282]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*                Experimental Design: Odd Number Linked List                  *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=293; i<304; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSize[i-293]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*               Experimental Design: Double Number Array List                 *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=304; i<317; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeArray[i-304]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("*               Experimental Design: Double Number Linked List                *");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Elapsed Time(ms) of Sorting Algorithms");
		System.out.println(" Data size\t| Counting-Sort\t   Merge-Sort\t Selection-Sort\t     Tim-Sort");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i=317; i<330; i++) {
			System.out.printf(" %dK\t\t| %13s\t%13s\t%15s\t%13s", numSizeLinked[i-317]/1000, resultCountingSort.get(i), resultMergeSort.get(i), resultSelectionSort.get(i), resultTimSort.get(i));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
	}
}
