package sortingAlgorithms;

import java.util.*;
import sortingAlgorithms.AbstractDataGenerator.Node;

public class Demo {

	public static void main(String[] args) {
countingSort countingSort = new countingSort();
		
		MergeSort<String> strMergeSort = new MergeSort<String>();
    	MergeSort<Integer> numMergeSort = new MergeSort<Integer>();
        MergeSort<Double> doubleNumMergeSort = new MergeSort<Double>();
		
		TimSort<String> strTimSort = new TimSort<String>();
		TimSort<Integer> intNumTimSort = new TimSort<Integer>();
		TimSort<Double> doubleNumTimSort = new TimSort<Double>();
		
		SelectionSort<String> strSelectionSort = new SelectionSort<String>();
        SelectionSort<Integer> nunselectionSort = new SelectionSort<Integer>();
        SelectionSort<Double> doubleNunselectionSort = new SelectionSort<Double>();
        
		int[] demoSize = {10, 100, 1000};
		
		// Test for random Strings
		for(int i:demoSize) {
			List<String> strList = countingSort.getStringList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortString(strList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " random Strings sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for sorted ascending String 
		for(int i:demoSize) {
			List<String> strSortedList = countingSort.getSortedStringList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortString(strSortedList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " sorted Strings sorting time: " + duration + " ns");
		}
		System.out.println(); 
		
		// Test for Reversed Strings
		for(int i:demoSize) {
			List<String> strReversedList = countingSort.getReversedStringList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortString(strReversedList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " reversed Strings sorting time: " + duration + " ns");
		}
		System.out.println();	
		
		// Test for Nearly Sorted Strings
		for(int i:demoSize) {
			List<String> strNSList = countingSort.getNearlySortedStringList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortString(strNSList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " nearly sorted Strings sorting time: " + duration + " ns");
		}
		System.out.println();
		
		// Test for Duplicate Strings
		for(int i:demoSize) {
			List<String> strDList = countingSort.getDuplicateStringList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortString(strDList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " duplicate Strings sorting time: " + duration + " ns");
		}
		System.out.println();	

		// Test for upper case Strings
		for(int i:demoSize) {
			List<String> strUpperList = countingSort.getUpperCaseStringList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortString(strUpperList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " upper case Strings sorting time: " + duration + " ns");
		}
		System.out.println();				
				
		// Test for lower case Strings
		for(int i:demoSize) {
			List<String> strLowerList = countingSort.getLowerCaseStringList(i);			
			long startTime = System.nanoTime();
			countingSort.countingSortString(strLowerList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " lower case Strings sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for random number ArrayList 
		for(int i:demoSize) {
			List<Integer> numArrayList = countingSort.getNumberArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " random number ArrayList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		// Test for random number LinkedList
        for (int i : demoSize) {
            List<Integer> numLinkedList = countingSort.getNumberLinkedList(i);
            
            // Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numNode = createNodeLinkedList(numLinkedList);
            
            long startTime = System.nanoTime();
            countingSort.countingSortLinkedNumber(numNode);
            long endTime = System.nanoTime();
            long duration = endTime-startTime;        
            System.out.println("Elapsed time of Counting Sort in " +  i + " random number LinkedList sorting time: " + duration + " ns");
        }
		System.out.println();
		
		//Test for sorted ascending number ArrayList
		for(int i:demoSize) {
			List<Integer> numSortedArrayList = countingSort.getSortedNumberArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numSortedArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;      
	        System.out.println("Elapsed time of Counting Sort in " +  i + " sorted number ArrayList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for sorted ascending number LinkedList
		for(int i:demoSize) {
			List<Integer> numSortedLinkedList = countingSort.getSortedNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numSortedNode = createNodeLinkedList(numSortedLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numSortedNode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        
	        System.out.println("Elapsed time of Counting Sort in " +  i + " sorted number LinkedList sorting time: " + duration + " ns");
		}
		System.out.println(); 				

		//Test for reversed number ArrayList 
		for(int i:demoSize) {
			List<Integer> numRArrayList = countingSort.getReversedNumberArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numRArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " reversed number ArrayList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for reversed number LinkedList
		for(int i:demoSize) {
			List<Integer> numRLinkedList = countingSort.getReversedNumberLinkedList(i);

			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numRNode = createNodeLinkedList(numRLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numRNode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " reversed number LinkedList sorting time: " + duration + " ns");
		}
		System.out.println();
				
		//Test for nearly sorted number ArrayList 
		for(int i:demoSize) {
			List<Integer> numNSArrayList = countingSort.getNearlySortedNumberArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numNSArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " nearly sorted number ArrayList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for nearly sorted number LinkedList
		for(int i:demoSize) {
			List<Integer> numNSLinkedList = countingSort.getNearlySortedNumberLinkedList(i);

			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numNSNode = createNodeLinkedList(numNSLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numNSNode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " nearly sorted number LinkedList sorting time: " + duration + " ns");
		}
		System.out.println();				

		//Test for duplicate number ArrayList 
		for(int i:demoSize) {
			List<Integer> numDArrayList = countingSort.getDuplicateNumArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numDArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " duplicate number ArrayList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for duplicate number LinkedList
		for(int i:demoSize) {
			List<Integer> numDLinkedList = countingSort.getDuplicateNumLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numDNode = createNodeLinkedList(numDLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numDNode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " duplicate number LinkedList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for outliers number ArrayList 
		for(int i:demoSize) {
			List<Integer> numOArrayList = countingSort.getOutliersArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numOArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " number ArrayList contains outliers sorting time: " + duration + " ns");
		}
		System.out.println();	
		
		//Test for outliers number LinkedList
		for(int i:demoSize) {
			List<Integer> numOLinkedList = countingSort.getOutliersLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numONode = createNodeLinkedList(numOLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numONode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " number LinkedList contains outliers sorting time: " + duration + " ns");
		}
		System.out.println();		

		//Test for skewed number ArrayList
		for(int i:demoSize) {
			List<Integer> numSkewedArrayList = countingSort.getSkewedArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numSkewedArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " number ArrayList contains skewed sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for skewed number LinkedList
		for(int i:demoSize) {
			List<Integer> numSkewedLinkedList = countingSort.getSkewedLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numSkewedNode = createNodeLinkedList(numSkewedLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numSkewedNode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " number LinkedList contains skewed sorting time: " + duration + " ns");
		}
		System.out.println();				
				
		//Test for negative number ArrayList
		for(int i:demoSize) {
			List<Integer> numNegativeArrayList = countingSort.getNegativeNumberArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numNegativeArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " negative number ArrayList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for negative number LinkedList
		for(int i:demoSize) {
			List<Integer> numNegativeLinkedList = countingSort.getNegativeNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numNegativeNode = createNodeLinkedList(numNegativeLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numNegativeNode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " negative number LinkedList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for even number ArrayList
		for(int i:demoSize) {
			List<Integer> numEvenArrayList = countingSort.getEvenNumberArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numEvenArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " even number ArrayList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for even number LinkedList
		for(int i:demoSize) {
			List<Integer> numEvenLinkedList = countingSort.getEvenNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numEvenNode = createNodeLinkedList(numEvenLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numEvenNode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " even number LinkedList sorting time: " + duration + " ns");
		}
		System.out.println();				
				
		//Test for odd number ArrayList
		for(int i:demoSize) {
			List<Integer> numOddArrayList = countingSort.getOddNumberArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortNumber(numOddArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " odd number ArrayList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		//Test for odd number LinkedList
		for(int i:demoSize) {
			List<Integer> numOddLinkedList = countingSort.getOddNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Integer> numOddNode = createNodeLinkedList(numOddLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numOddNode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " odd number LinkedList sorting time: " + duration + " ns");
		}
		System.out.println();						
		
		//Test for double number ArrayList 
		for(int i:demoSize) {
			List<Double> numDoArrayList = countingSort.getDoubleNumberArrayList(i);
			long startTime = System.nanoTime();
			countingSort.countingSortDoubleNumber(numDoArrayList,0,99999.0);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " double number ArrayList sorting time: " + duration + " ns");
		}
		System.out.println();
			
		//Test for double number LinkedList
		for(int i:demoSize) {
			List<Double> numDoLinkedList = countingSort.getDoubleNumberLinkedList(i);
			
			// Convert LinkedList to Node-based LinkedList
            countingSort.Node<Double> numDoubleNode = createNodeLinkedList(numDoLinkedList);
            
			long startTime = System.nanoTime();
			countingSort.countingSortLinkedNumber(numDoubleNode);
	        long endTime = System.nanoTime();
	        long duration = endTime-startTime;
	        System.out.println("Elapsed time of Counting Sort in " +  i + " double number LinkedList sorting time: " + duration + " ns");
		}
		System.out.println();
		
		// 1. Test for random Strings
		for(int i:demoSize) {
            List<String> strList = strMergeSort.getStringList(i);
            long startTime = System.nanoTime();
            strMergeSort.mergeSort(strList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i+ " random Strings ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // 2. Test for sorted ascending String 
        for(int i:demoSize) {
            List<String> sortedStrList = strMergeSort.getSortedStringList(i);
            long startTime = System.nanoTime();
            strMergeSort.mergeSort(sortedStrList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " sorted Strings ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // 3. Test for Reversed Strings
        for(int i:demoSize) {
            ArrayList<String> reversedStrList = strMergeSort.getReversedStringList(i);
            long startTime = System.nanoTime();
            strMergeSort.mergeSort(reversedStrList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " reversed Strings ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // 4. Test for Nearly Sorted Strings
        for(int i:demoSize) {
            ArrayList<String> nearlySortedStrList = strMergeSort.getNearlySortedStringList(i);
            long startTime = System.nanoTime();
            strMergeSort.mergeSort(nearlySortedStrList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " nearly sorted Strings ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // 5. Test for Duplicate Strings
        for(int i:demoSize) {
            ArrayList<String> duplicateStrList = strMergeSort.getDuplicateStringList(i);
            long startTime = System.nanoTime();
            strMergeSort.mergeSort(duplicateStrList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " Strings ArrayList contains duplicates: " + duration + " ns");
        }
        System.out.println();
        
        // 6. Test for upper case Strings
 		for(int i:demoSize) {
 			List<String> strUpperList = strMergeSort.getUpperCaseStringList(i);
 			long startTime = System.nanoTime();
 			strMergeSort.mergeSort(strUpperList);
 	        long endTime = System.nanoTime();
 	       long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " upper case Strings ArrayList: " + duration + " ns");
 		}
 		System.out.println();				
 				
 		// 7. Test for lower case Strings
 		for(int i:demoSize) {
 			List<String> strLowerList = strMergeSort.getLowerCaseStringList(i);
 			long startTime = System.nanoTime();
 			strMergeSort.mergeSort(strLowerList);
 	        long endTime = System.nanoTime();
 	       long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " lower case Strings ArrayList: " + duration + " ns");
 		}
 		System.out.println();	
 		
 		// 8. Test for random number ArrayList 
        for(int i:demoSize) {
            ArrayList<Integer> numArrayList = numMergeSort.getNumberArrayList(i);
            long startTime = System.nanoTime();
            numMergeSort.mergeSort(numArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " random Number ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // 9. Test for random number LinkedList
        for(int i:demoSize) {
            LinkedList<Integer> numLinkedList = numMergeSort.getNumberLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(numLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " random Number LinkedList: " + duration + " ns");
        }
        System.out.println();
        
        // 10. Test for sorted ascending number ArrayList
        for(int i:demoSize) {
            ArrayList<Integer> sortedNumArrayList = numMergeSort.getSortedNumberArrayList(i);
            long startTime = System.nanoTime();
            numMergeSort.mergeSort(sortedNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " sorted Number ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // 11. Test for sorted ascending number LinkedList
        for(int i:demoSize) {
            LinkedList<Integer> sortedNumLinkedList = numMergeSort.getSortedNumberLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(sortedNumLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " sorted Number LinkedList: " + duration + " ns");
        }
        System.out.println();

        // 12. Test for reversed number ArrayList
        for(int i:demoSize) {
            ArrayList<Integer> rNumArrayList = numMergeSort.getReversedNumberArrayList(i);
            long startTime = System.nanoTime();
            numMergeSort.mergeSort(rNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " reversed Number ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // 13. Test for reversed number LinkedList
        for(int i:demoSize) {
            LinkedList<Integer> rNumLinkedList = numMergeSort.getReversedNumberLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(rNumLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " reversed Number LinkedList: " + duration + " ns");
        }
        System.out.println();

        // 14. Test for nearly sorted number ArrayList 
        for(int i:demoSize) {
            ArrayList<Integer> nsNumArrayList = numMergeSort.getNearlySortedNumberArrayList(i);
            long startTime = System.nanoTime();
            numMergeSort.mergeSort(nsNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " nearly sorted Number ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // 15. Test for nearly sorted number LinkedList 
        for(int i:demoSize) {
            LinkedList<Integer> nsNumLinkedList = numMergeSort.getNearlySortedNumberLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(nsNumLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " nearly sorted Number LinkedList: " + duration + " ns");
        }
        System.out.println();
        
		
        // 16. Test for duplicate number ArrayList 
        for(int i:demoSize) {
            ArrayList<Integer> dupNumArrayList = numMergeSort.getDuplicateNumArrayList(i);
            long startTime = System.nanoTime();
            numMergeSort.mergeSort(dupNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " duplicate Number ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // 17. Test for duplicate number LinkedList
         for(int i:demoSize) {
            LinkedList<Integer> dupNumLinkedList = numMergeSort.getDuplicateNumLinkedList(i);
            MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(dupNumLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Merge Sort " + i + " duplicate Number LinkedList: " + duration + " ns");
        }
        System.out.println();
        
        // 18. Test for outliers number ArrayList 
 		for(int i:demoSize) {
 			ArrayList<Integer> outNumArrayList = numMergeSort.getOutliersArrayList(i);
 			long startTime = System.nanoTime();
 			numMergeSort.mergeSort(outNumArrayList);
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " Number ArrayList contains outliers: " + duration + " ns");
 		}
 		System.out.println();
     		
 		// 19. Test for outliers number LinkedList
 		for(int i:demoSize) {
 			LinkedList<Integer> outNumLinkedList = numMergeSort.getOutliersLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(outNumLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " Number LinkedList contains outliers: " + duration + " ns");
 		}
 		System.out.println();

 		// 20. Test for skewed number ArrayList
 		for(int i:demoSize) {
 			ArrayList<Integer> skewedNumArrayList = numMergeSort.getSkewedArrayList(i);
 			long startTime = System.nanoTime();
 			numMergeSort.mergeSort(skewedNumArrayList);
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " skewed Number ArrayList: " + duration + " ns");
 		}
 		System.out.println();
     		
 		// 21. Test for skewed number LinkedList
 		for(int i:demoSize) {
 			LinkedList<Integer> skewedNumLinkedList = numMergeSort.getSkewedLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(skewedNumLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " skewed Number LinkedList: " + duration + " ns");
 		}
 		System.out.println();
 		
 		// 22. Test for negative number ArrayList
 		for(int i:demoSize) {
 			ArrayList<Integer> numNegativeArrayList = numMergeSort.getNegativeNumberArrayList(i);
            long startTime = System.nanoTime();
            numMergeSort.mergeSort(numNegativeArrayList); 
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " negative Number ArrayList: " + duration + " ns");
 		}
 		System.out.println();
 	 		
 	 	// 23. Test for negative number LinkedList
 		for(int i:demoSize) {
 			LinkedList<Integer> negativeNumLinkedList = numMergeSort.getNegativeNumberLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(negativeNumLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " negative Number LinkedList: " + duration + " ns");
 		}
 		System.out.println();
 		
 		// 24. Test for even number ArrayList
 		for(int i:demoSize) {
 			ArrayList<Integer> numEvenArrayList = numMergeSort.getEvenNumberArrayList(i);
            long startTime = System.nanoTime();
            numMergeSort.mergeSort(numEvenArrayList); 
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " even Number ArrayList: " + duration + " ns");
 		}
 		System.out.println();
 		
 		// 25. Test for even number LinkedList
 		for(int i:demoSize) {
 			LinkedList<Integer> numEvenLinkedList = numMergeSort.getEvenNumberLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(numEvenLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " even Number LinkedList: " + duration + " ns");
 		}
 		System.out.println();
 		
 		// 26. Test for odd number ArrayList
 		for(int i:demoSize) {
 			ArrayList<Integer> numOddArrayList = numMergeSort.getOddNumberArrayList(i);
            long startTime = System.nanoTime();
            numMergeSort.mergeSort(numOddArrayList); 
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " odd Number ArrayList: " + duration + " ns");
 		}
 		System.out.println();
 		
 		// 27. Test for odd number LinkedList
 		for(int i:demoSize) {
 			LinkedList<Integer> numOddLinkedList = numMergeSort.getOddNumberLinkedList(i);
 			MergeSort.Node<Integer> head = numMergeSort.convertToNodeList(numOddLinkedList);
            long startTime = System.nanoTime();
            head = numMergeSort.mergeSort(head); 
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " odd Number LinkedList: " + duration + " ns");
 		}
 		System.out.println();
 		
 		// 28. Test for double number ArrayList
 		for(int i:demoSize) {
 			ArrayList<Double> doubleNumArrayList = doubleNumMergeSort.getDoubleNumberArrayList(i);
 			long startTime = System.nanoTime();
 			doubleNumMergeSort.mergeSort(doubleNumArrayList);
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " Double Number ArrayList: " + duration + " ns");
 		}
 		System.out.println();
 		
 		// 29. Test for double number LinkedList
 		for(int i:demoSize) {
 			LinkedList<Double> doubleNumLinkedList = doubleNumMergeSort.getDoubleNumberLinkedList(i);
 			MergeSort.Node<Double> head = doubleNumMergeSort.convertToNodeList(doubleNumLinkedList);
            long startTime = System.nanoTime();
            head = doubleNumMergeSort.mergeSort(head); 
 	        long endTime = System.nanoTime();
 	        long duration = endTime - startTime;
 	        System.out.println("Elapsed time of Merge Sort " + i + " Double Number LinkedList: " + duration + " ns");
 		}
 		System.out.println();
		
		// Benchmarking TimSort on varying sizes of String ArrayList
		for(int i:demoSize) {
			List<String> strList = strTimSort.getStringList(i);
			long startTime = System.nanoTime();
			strTimSort.timSortA(strList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " random Strings ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of sorted String ArrayList
		for(int i:demoSize) {
			List<String> sortedStrList = strTimSort.getSortedStringList(i);
			long startTime = System.nanoTime();
			strTimSort.timSortA(sortedStrList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " sorted Strings ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of reversed String ArrayList
		for(int i:demoSize) {
			ArrayList<String> reversedStrList = strTimSort.getReversedStringList(i);
			long startTime = System.nanoTime();
			strTimSort.timSortA(reversedStrList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " reversed Strings ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of nearly sorted String ArrayList
		for(int i:demoSize) {
			ArrayList<String> nearlySortedStrList = strTimSort.getNearlySortedStringList(i);
			long startTime = System.nanoTime();
			strTimSort.timSortA(nearlySortedStrList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " nearly sorted Strings ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of duplicate String ArrayList
		for(int i:demoSize) {
			ArrayList<String> duplicateStrList = strTimSort.getDuplicateStringList(i);
			long startTime = System.nanoTime();
			strTimSort.timSortA(duplicateStrList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " Strings ArrayList contains duplicates: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of upper case String ArrayList
		for(int i:demoSize) {
			ArrayList<String> upStrList = strTimSort.getUpperCaseStringList(i);
			long startTime = System.nanoTime();
			strTimSort.timSortA(upStrList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " Upper Case Strings ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of lower case String ArrayList
		for(int i:demoSize) {
			ArrayList<String> lowStrList = strTimSort.getLowerCaseStringList(i);
			long startTime = System.nanoTime();
			strTimSort.timSortA(lowStrList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " Lower Case Strings ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of random Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> numArrayList = intNumTimSort.getNumberArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(numArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " random Number ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of random Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> numLinkedList = intNumTimSort.getNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(numLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " random Number LinkedList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of sorted Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> sortedNumArrayList = intNumTimSort.getSortedNumberArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(sortedNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " sorted Number ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of sorted Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> sortedNumLinkedList = intNumTimSort.getSortedNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(sortedNumLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " sorted Number LinkedList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of reversed Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> rNumArrayList = intNumTimSort.getReversedNumberArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(rNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " reversed Number ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of reversed Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> rNumLinkedList = intNumTimSort.getReversedNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(rNumLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " reversed Number LinkedList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of nearly sorted Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> nsNumArrayList = intNumTimSort.getNearlySortedNumberArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(nsNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " nearly sorted Number ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of nearly sorted Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> nsNumLinkedList = intNumTimSort.getNearlySortedNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(nsNumLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " nearly sorted Number LinkedList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of duplicate Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> dupNumArrayList = intNumTimSort.getDuplicateNumArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(dupNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " Number ArrayList contains duplicates: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of duplicate Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> dupNumLinkedList = intNumTimSort.getDuplicateNumLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(dupNumLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " Number LinkedList contains duplicates: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of outlier Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> outNumArrayList = intNumTimSort.getOutliersArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(outNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " Number ArrayList contains outliers: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of outlier Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> outNumLinkedList = intNumTimSort.getOutliersLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(outNumLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " Number LinkedList contains outliers: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of skewed Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> skewedNumArrayList = intNumTimSort.getSkewedArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(skewedNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " skewed Number ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of skewed Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> skewedNumLinkedList = intNumTimSort.getSkewedLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(skewedNumLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " skewed Number LinkedList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of negative Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> negNumArrayList = intNumTimSort.getNegativeNumberArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(negNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " negative Number ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of negative Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> negNumLinkedList = intNumTimSort.getNegativeNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(negNumLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " negative Number LinkedList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of even Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> evenNumArrayList = intNumTimSort.getEvenNumberArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(evenNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " even Number ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of even Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> evenNumLinkedList = intNumTimSort.getEvenNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(evenNumLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " even Number LinkedList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of odd Number ArrayList
		for(int i:demoSize) {
			ArrayList<Integer> oddNumArrayList = intNumTimSort.getOddNumberArrayList(i);
			long startTime = System.nanoTime();
			intNumTimSort.timSortA(oddNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " odd Number ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of odd Number LinkedList
		for(int i:demoSize) {
			LinkedList<Integer> oddNumLinkedList = intNumTimSort.getOddNumberLinkedList(i);
			Node<Integer> head = intNumTimSort.convertToNodeList(oddNumLinkedList);
			long startTime = System.nanoTime();
			intNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " odd Number LinkedList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of Double Number ArrayList
		for(int i:demoSize) {
			ArrayList<Double> doubleNumArrayList = doubleNumTimSort.getDoubleNumberArrayList(i);
			long startTime = System.nanoTime();
			doubleNumTimSort.timSortA(doubleNumArrayList);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " Double Number ArrayList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmarking TimSort on varying sizes of Double Number LinkedList
		for(int i:demoSize) {
			LinkedList<Double> doubleNumLinkedList = doubleNumTimSort.getDoubleNumberLinkedList(i);
			Node<Double> head = doubleNumTimSort.convertToNodeList(doubleNumLinkedList);
			long startTime = System.nanoTime();
			doubleNumTimSort.timSortL(head);
	        long endTime = System.nanoTime();
	        long duration = endTime - startTime;
	        System.out.println("Elapsed time of Tim Sort " + i + " Double Number LinkedList: " + duration + " ns");
		}
		System.out.println();
		
		// Benchmaring Random Strings - ArrayList
		for (int i : demoSize) {
            List<String> strList = strSelectionSort.getStringList(i);
            long startTime = System.nanoTime();
            strSelectionSort.selectionSortArray(strList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " random Strings ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Sorted Strings - ArrayList
        for (int i : demoSize) {
            List<String> sortedStrList = strSelectionSort.getSortedStringList(i);
            long startTime = System.nanoTime();
            strSelectionSort.selectionSortArray(sortedStrList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " sorted Strings ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Reversed Strings - ArrayList
        for (int i : demoSize) {
            ArrayList<String> reversedStrList = strSelectionSort.getReversedStringList(i);
            long startTime = System.nanoTime();
            strSelectionSort.selectionSortArray(reversedStrList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " reversed Strings ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Nearly Sorted Strings - ArrayList
        for (int i : demoSize) {
            ArrayList<String> nearlySortedStrList = strSelectionSort.getNearlySortedStringList(i);
            long startTime = System.nanoTime();
            strSelectionSort.selectionSortArray(nearlySortedStrList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " nearly sorted Strings ArrayList: " + duration + " ns");
        }
        System.out.println();
        
        // Benchmaring Duplicate Strings - ArrayList
        for (int i : demoSize) {
            ArrayList<String> duplicateStrList = strSelectionSort.getDuplicateStringList(i);
            long startTime = System.nanoTime();
            strSelectionSort.selectionSortArray(duplicateStrList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " Strings ArrayList contains duplicates: " + duration + " ns");
        }
        System.out.println();
        
     // Benchmaring Upper Case Strings - ArrayList
      for (int i : demoSize) {
          ArrayList<String> upperCaseStrList = strSelectionSort.getUpperCaseStringList(i);
          long startTime = System.nanoTime();
          strSelectionSort.selectionSortArray(upperCaseStrList);
          long endTime = System.nanoTime();
          long duration = endTime - startTime;
          System.out.println("Elapsed time of Selection Sort in " + i + " Upper Case Strings ArrayList: " + duration + " ns");
      }
      System.out.println();
      
      // Benchmaring Lower Case Strings - ArrayList
      for (int i : demoSize) {
          ArrayList<String> lowerCaseStrList = strSelectionSort.getLowerCaseStringList(i);
          long startTime = System.nanoTime();
          strSelectionSort.selectionSortArray(lowerCaseStrList);
          long endTime = System.nanoTime();
          long duration = endTime - startTime;
          System.out.println("Elapsed time of Selection Sort in " + i + " Lower Case Strings ArrayList: " + duration + " ns");
      }
      System.out.println();

        // Benchmaring Random Numbers - ArrayList
        for (int i : demoSize) {
            ArrayList<Integer> numArrayList = nunselectionSort.getNumberArrayList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortArray(numArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " random Number ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Random Numbers - LinkedList
        for (int i : demoSize) {
            LinkedList<Integer> numLinkedList = nunselectionSort.getNumberLinkedList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortLinked(numLinkedList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " random Number LinkedList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Sorted Numbers - ArrayList
        for (int i : demoSize) {
            ArrayList<Integer> sortedNumArrayList = nunselectionSort.getSortedNumberArrayList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortArray(sortedNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " sorted Number ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Sorted Numbers - LinkedList
        for (int i : demoSize) {
            LinkedList<Integer> sortedNumLinkedList = nunselectionSort.getSortedNumberLinkedList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortLinked(sortedNumLinkedList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " sorted Number LinkedList: " + duration + " ns");
        }
        System.out.println();

         //Benchmaring Reversed Numbers - ArrayList
        for (int i : demoSize) {
            ArrayList<Integer> rNumArrayList = nunselectionSort.getReversedNumberArrayList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortArray(rNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " reversed Number ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Reversed Numbers - LinkedList
        for (int i : demoSize) {
            LinkedList<Integer> rNumLinkedList = nunselectionSort.getReversedNumberLinkedList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortLinked(rNumLinkedList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " reversed Number LinkedList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Nearly Sorted Numbers - ArrayList
        for (int i : demoSize) {
            ArrayList<Integer> nsNumArrayList = nunselectionSort.getNearlySortedNumberArrayList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortArray(nsNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " nearly sorted Number ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Nearly Sorted Numbers - LinkedList
        for (int i : demoSize) {
            LinkedList<Integer> nsNumLinkedList = nunselectionSort.getNearlySortedNumberLinkedList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortLinked(nsNumLinkedList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " nearly sorted Number LinkedList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Duplicate Numbers - ArrayList
        for (int i : demoSize) {
            ArrayList<Integer> dNumArrayList = nunselectionSort.getDuplicateNumArrayList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortArray(dNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " duplicate Number ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Duplicate Numbers - LinkedList
        for (int i : demoSize) {
            LinkedList<Integer> dNumLinkedList = nunselectionSort.getDuplicateNumLinkedList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortLinked(dNumLinkedList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " duplicate Number LinkedList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Outliers Numbers - ArrayList
        for (int i : demoSize) {
            ArrayList<Integer> outlierNumArrayList = nunselectionSort.getOutliersArrayList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortArray(outlierNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " outliers Number ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Outliers Numbers - LinkedList
        for (int i : demoSize) {
            LinkedList<Integer> outlierNumLinkedList = nunselectionSort.getOutliersLinkedList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortLinked(outlierNumLinkedList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " outliers Number LinkedList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Sewed Numbers - ArrayList
        for (int i : demoSize) {
            ArrayList<Integer> sewedNumArrayList = nunselectionSort.getSkewedArrayList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortArray(sewedNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " sewed Number ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Sewed Numbers - LinkedList
        for (int i : demoSize) {
            LinkedList<Integer> sewedNumLinkedList = nunselectionSort.getSkewedLinkedList(i);
            long startTime = System.nanoTime();
            nunselectionSort.selectionSortLinked(sewedNumLinkedList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " sewed Number LinkedList: " + duration + " ns");
        }
        System.out.println();

      // Benchmaring Negative Numbers - ArrayList
      for (int i : demoSize) {
          ArrayList<Integer> negNumArrayList = nunselectionSort.getNegativeNumberArrayList(i);
          long startTime = System.nanoTime();
          nunselectionSort.selectionSortArray(negNumArrayList);
          long endTime = System.nanoTime();
          long duration = endTime - startTime;
          System.out.println("Elapsed time of Selection Sort in " + i + " negative Number ArrayList: " + duration + " ns");
      }
      System.out.println();

      // Benchmaring Negative Numbers - LinkedList
      for (int i : demoSize) {
          LinkedList<Integer> negNumLinkedList = nunselectionSort.getNegativeNumberLinkedList(i);
          long startTime = System.nanoTime();
          nunselectionSort.selectionSortLinked(negNumLinkedList);
          long endTime = System.nanoTime();
          long duration = endTime - startTime;
          System.out.println("Elapsed time of Selection Sort in " + i + " negative Number LinkedList: " + duration + " ns");
      }
      System.out.println();

      // Benchmaring Even Numbers - ArrayList
      for (int i : demoSize) {
          ArrayList<Integer> evenNumArrayList = nunselectionSort.getEvenNumberArrayList(i);
          long startTime = System.nanoTime();
          nunselectionSort.selectionSortArray(evenNumArrayList);
          long endTime = System.nanoTime();
          long duration = endTime - startTime;
          System.out.println("Elapsed time of Selection Sort in " + i + " even Number ArrayList: " + duration + " ns");
      }
      System.out.println();

      // Benchmaring Even Numbers - LinkedList
      for (int i : demoSize) {
          LinkedList<Integer> evenNumLinkedList = nunselectionSort.getEvenNumberLinkedList(i);
          long startTime = System.nanoTime();
          nunselectionSort.selectionSortLinked(evenNumLinkedList);
          long endTime = System.nanoTime();
          long duration = endTime - startTime;
          System.out.println("Elapsed time of Selection Sort in " + i + " even Number LinkedList: " + duration + " ns");
      }
      System.out.println();
      
      // Benchmaring Odd Numbers - ArrayList
      for (int i : demoSize) {
          ArrayList<Integer> oddNumArrayList = nunselectionSort.getOddNumberArrayList(i);
          long startTime = System.nanoTime();
          nunselectionSort.selectionSortArray(oddNumArrayList);
          long endTime = System.nanoTime();
          long duration = endTime - startTime;
          System.out.println("Elapsed time of Selection Sort in " + i + " odd Number ArrayList: " + duration + " ns");
      }
      System.out.println();

      
      // Benchmaring Odd Numbers - LinkedList
      for (int i : demoSize) {
          LinkedList<Integer> oddNumLinkedList = nunselectionSort.getOddNumberLinkedList(i);
          long startTime = System.nanoTime();
          nunselectionSort.selectionSortLinked(oddNumLinkedList);
          long endTime = System.nanoTime();
          long duration = endTime - startTime;
          System.out.println("Elapsed time of Selection Sort in " + i + " odd Number LinkedList: " + duration + " ns");
      }
      System.out.println();
        
        
        // Benchmaring Double Numbers - ArrayList
        for (int i : demoSize) {
            ArrayList<Double> doubleNumArrayList = doubleNunselectionSort.getDoubleNumberArrayList(i);
            long startTime = System.nanoTime();
            doubleNunselectionSort.selectionSortArray(doubleNumArrayList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " double Number ArrayList: " + duration + " ns");
        }
        System.out.println();

        // Benchmaring Double Numbers - LinkedList
        for (int i : demoSize) {
            LinkedList<Double> doubleNumLinkedList = doubleNunselectionSort.getDoubleNumberLinkedList(i);
            long startTime = System.nanoTime();
            doubleNunselectionSort.selectionSortLinked(doubleNumLinkedList);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Elapsed time of Selection Sort in " + i + " double Number LinkedList: " + duration + " ns");
        }
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
