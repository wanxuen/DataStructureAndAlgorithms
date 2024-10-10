package sortingAlgorithms;

import java.io.*;
import java.util.*;

public abstract class AbstractDataGenerator implements DataGenerator {
	// Create a Random object with a fixed seed
	Random random = new Random(42);
    
	// Instance variables
	private List<String> allStrings; // To store all English words
    private List<Integer> allNumbers; // To store all random numbers
    private List<String> duplicatesStr; // To store duplicate String elements
    private List<Integer> duplicatesNum; // To store duplicate Number elements
    
    private ArrayList<String> randomStrList;
    private ArrayList<String> sortedStrList;
    private ArrayList<String> rStrList;
    private ArrayList<String> nsStrList;
    private ArrayList<String> dStrList;
    private ArrayList<String> lowerCaseStrList;
    private ArrayList<String> upperCaseStrList;
    
    private ArrayList<Integer> intAList;
    private LinkedList<Integer> intLList;
    private ArrayList<Integer> intAsortedList;
    private LinkedList<Integer> intLsortedList;
    private ArrayList<Integer> reversedAList;
    private LinkedList<Integer> reversedLList;
    private ArrayList<Integer> nsAList;
    private LinkedList<Integer> nsLList;
    
    private ArrayList<Integer> duplicateAList;
    private LinkedList<Integer> duplicateLList;
    private ArrayList<Integer> outlierAList;
    private LinkedList<Integer> outlierLList;
    private ArrayList<Integer> skewedAList;
    private LinkedList<Integer> skewedLList;
    private ArrayList<Integer> negAList;
    private LinkedList<Integer> negLList;
    private ArrayList<Integer> evenAList;
    private LinkedList<Integer> evenLList;
    private ArrayList<Integer> oddAList;
    private LinkedList<Integer> oddLList;
    
    private ArrayList<Double> doubleAList;
    private LinkedList<Double> doubleLList;
    
    // Constructor
    public AbstractDataGenerator(){
        allStrings = new ArrayList<>();
        allNumbers = new ArrayList<>();
        duplicatesStr = new ArrayList<>();
        duplicatesNum = new ArrayList<>();
        
        randomStrList = new ArrayList<>();
        sortedStrList = new ArrayList<>();
        rStrList = new ArrayList<>();
        nsStrList = new ArrayList<>();
        dStrList = new ArrayList<>();
        lowerCaseStrList = new ArrayList<>();
        upperCaseStrList = new ArrayList<>();
        
        intAList = new ArrayList<>();
        intLList = new LinkedList<>();
        intAsortedList = new ArrayList<>();
        intLsortedList = new LinkedList<>();
        reversedAList= new ArrayList<>();
        reversedLList=new LinkedList<>();
        nsAList = new ArrayList<>();
        nsLList = new LinkedList<>();
        
        duplicateAList = new ArrayList<>();
        duplicateLList = new LinkedList<>();
        outlierAList = new ArrayList<>();
        outlierLList = new LinkedList<>();
        skewedAList = new ArrayList<>();
        skewedLList= new LinkedList<>();
        negAList = new ArrayList<>();
        negLList = new LinkedList<>();
        evenAList = new ArrayList<>();
        evenLList = new LinkedList<>();
        oddAList = new ArrayList<>();
        oddLList = new LinkedList<>();
        
        doubleAList = new ArrayList<>();
        doubleLList = new LinkedList<>();
        
        // Load data
        readDataFromFiles();
    }
    
    // Method to read data from the files
    public void readDataFromFiles(){
    	// Read English Words file
    	File wordsFile = new File("Words.txt");
    	try {
            Scanner wordScanner = new Scanner(wordsFile);
            while (wordScanner.hasNextLine()) {
                String line = wordScanner.nextLine().trim();
                if (!line.isEmpty()) {
                    allStrings.add(line);
                }
            }
            wordScanner.close(); // Close the Scanner
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        
        // Read Numbers file
        File numbersFile = new File("RandomNumbers.txt");
        try {
            Scanner numberScanner = new Scanner(numbersFile);
            while (numberScanner.hasNextLine()) {
                String line = numberScanner.nextLine().trim();
                if (!line.isEmpty()) {
                    try {
                        int number = Integer.parseInt(line);
                        allNumbers.add(number);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format in file: " + line);
                    }
                }
            }
            numberScanner.close(); // Close the Scanner
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
 	
 	// Method to get String ArrayList based on the input size
 	public ArrayList<String> getStringList(int size) {
 		randomStrList.clear();
 		Iterator<String> iterator = allStrings.iterator();
 		
 		// Add str based on size input
 	    while (iterator.hasNext() && randomStrList.size()<size) {
 	        String str = iterator.next();
 	        randomStrList.add(str);
        }
		return randomStrList;
	}
 	
 	// Method to get sorted String ArrayList based on the input size
 	public ArrayList<String> getSortedStringList(int size) {
 		sortedStrList.clear();
 		ArrayList<String> sortedList = new ArrayList<>(allStrings);
        Collections.sort(sortedList);
 	    Iterator<String> iterator = sortedList.iterator();
 	    
 	    // Add str based on size input
 	    while (iterator.hasNext() && sortedStrList.size()<size) {
 	        String str = iterator.next();
 	        sortedStrList.add(str);
 	    }
 	    return sortedStrList;
	}
 	
 	// Method to get reversed String ArrayList based on the input size
    public ArrayList<String> getReversedStringList(int size) {
    	rStrList.clear();
    	ArrayList<String> copy = new ArrayList<>(allStrings);
    	Collections.sort(copy);
   		Collections.reverse(copy);  // Reverse the list of strings
 	 	Iterator<String> iterator = copy.iterator();
 	 	
 	 	// Add str based on size input
 	 	while (iterator.hasNext() && rStrList.size()<size) {
 	 	    String str = iterator.next();
 	 	    rStrList.add(str);
 	 	}
    	return rStrList;
   	}
    
    // Method to get nearly sorted String ArrayList based on the input size
   	public ArrayList<String> getNearlySortedStringList(int size) {
   		nsStrList.clear();
   		ArrayList<String> sortedList = new ArrayList<>(allStrings);
        Collections.sort(sortedList);

        // Shuffle 10% of the list
        int shuffleCount = (int) (0.1 * sortedList.size()); 
        for (int i = 0; i < shuffleCount; i++) {
            int index1 = random.nextInt(sortedList.size());
            int index2 = random.nextInt(sortedList.size());

            // Swap two random elements
            Collections.swap(sortedList, index1, index2);
        }

        // Add the elements based on size input
        for (int i=0; nsStrList.size()<size; i++) {
    		String str = sortedList.get(i);
    		nsStrList.add(str);
    	}
        return nsStrList;
  	}
   	
 	// Method to get duplicate String elements ArrayList based on the input size
  	public ArrayList<String> getDuplicateStringList(int size) {
  		dStrList.clear();
  		ArrayList<String> copy = new ArrayList<>(allStrings);
  		
  		// Calculate 10% of the size and generate a list of repeated single String
  		int dSize = (int) (0.1 * size);
  		String duplicate = copy.get(0);
 		for(int i=0; i<dSize; i++) {
 			duplicatesStr.add(duplicate);
 		}
 		
 		dStrList.addAll(duplicatesStr);
 		// Add the elements based on size input
 		for(int i=0; dStrList.size()<size; i++) {
				String strs = copy.get(i);
				dStrList.add(strs);	
	 	}
  		return dStrList;
 	}
  	
  	// Method to get upper case String elements ArrayList based on the input size
   	public ArrayList<String> getUpperCaseStringList(int size) {
   		upperCaseStrList.clear();
   		ArrayList<String> copy = new ArrayList<>(allStrings);
   		
   		// Convert all strings to upper case
   	    for (int i = 0; i < copy.size(); i++) {
   	        copy.set(i, copy.get(i).toUpperCase());
   	    }
  		
  		// Add the elements based on size input
  		for(int i=0; upperCaseStrList.size()<size; i++) {
 				String strs = copy.get(i);
 				upperCaseStrList.add(strs);	
 	 	}
   		return upperCaseStrList;
  	}
   	
  	// Method to get lower case String elements ArrayList based on the input size
   	public ArrayList<String> getLowerCaseStringList(int size) {
   		lowerCaseStrList.clear();
   		ArrayList<String> copy = new ArrayList<>(allStrings);
   		
   		// Convert all strings to lower case
   	    for (int i = 0; i < copy.size(); i++) {
   	        copy.set(i, copy.get(i).toLowerCase());
   	    }
  		
  		// Add the elements based on size input
  		for(int i=0; lowerCaseStrList.size()<size; i++) {
 				String strs = copy.get(i);
 				lowerCaseStrList.add(strs);	
 	 	}
   		return lowerCaseStrList;
  	}
   	
 	// Method to get integer number ArrayList based on the input size
 	public ArrayList<Integer> getNumberArrayList(int size) {
 		intAList.clear();
 		for (int i=0; intAList.size()<size; i++) {
				Integer number = allNumbers.get(i);
				intAList.add(number);
	 	}
 		return intAList;
 	}
 	
 	// Method to get integer number LinkedList based on the input size
 	public LinkedList<Integer> getNumberLinkedList(int size) {
 		intLList.clear();
 		for (int i=0; intLList.size() < size; i++) {
				Integer number = allNumbers.get(i);
				intLList.add(number);
	 	}
 		return intLList;
 	}
 	
 	// Method to get sorted integer number ArrayList based on the input size
 	public ArrayList<Integer> getSortedNumberArrayList(int size) {
 		intAsortedList.clear();
 		ArrayList<Integer> copy = new ArrayList<>(allNumbers);
 		Collections.sort(copy);
 		
 		for (int i=0; intAsortedList.size() < size; i++) {
				Integer number = copy.get(i);
				intAsortedList.add(number);
	 	}
 	    return intAsortedList;
	}
 	
 	// Method to get sorted integer number LinkedList based on the input size
 	public LinkedList<Integer> getSortedNumberLinkedList(int size) {
 		intLsortedList.clear();
 		LinkedList<Integer> copy = new LinkedList<>(allNumbers);
 		Collections.sort(copy);
 		
 		Iterator<Integer> iterator = copy.iterator();
 	 	
 	 	// Add number based on size input
 	 	while (iterator.hasNext() && intLsortedList.size()<size) {
 	 		Integer number = iterator.next();
 	 		intLsortedList.add(number);
 	 	}
 	    return intLsortedList;
	}
 	
 	// Method to get reversed number ArrayList based on input size
   	public ArrayList<Integer> getReversedNumberArrayList(int size) {
   		reversedAList.clear();
   		ArrayList<Integer> copy = new ArrayList<>(allNumbers);
   		Collections.sort(copy);
  		Collections.reverse(copy);
  		
  		for (int i=0; reversedAList.size()<size; i++) {
				Integer number = copy.get(i);
				reversedAList.add(number);
	 	}
		return reversedAList;
   	}
   	
   	// Method to get reversed number LinkedList based on input size
    public LinkedList<Integer> getReversedNumberLinkedList(int size) {
    	reversedLList.clear();
    	LinkedList<Integer> copy = new LinkedList<>(allNumbers);
    	Collections.sort(copy);
  		Collections.reverse(copy);
  		
  		Iterator<Integer> iterator = copy.iterator();
 	 	
 	 	// Add number based on size input
 	 	while (iterator.hasNext() && reversedLList.size() < size) {
 	 		Integer number = iterator.next();
 	 		reversedLList.add(number);
 	 	}
		return reversedLList;
    }
  	
    // Method to get nearly sorted number ArrayList based on input size
   	public ArrayList<Integer> getNearlySortedNumberArrayList(int size) {
   		nsAList.clear();
   		ArrayList<Integer> copy = new ArrayList<>(allNumbers);
  	    Collections.sort(copy);
  	    
  	    // Shuffle 10% of the list 
  	    int swapCount = (int) (0.1 * copy.size()); 

  	    for (int i = 0; i < swapCount; i++) {
  	        int index1 = random.nextInt(copy.size());
  	        int index2 = random.nextInt(copy.size());

  	        // Swap two random elements
  	        Integer temp = copy.get(index1);
  	        copy.set(index1, copy.get(index2));
  	        copy.set(index2, temp);
  	    }
  	    
  	   // Add the elements according to each size
  	   for (int i=0; nsAList.size()<size; i++) {
			Integer number = copy.get(i);
			nsAList.add(number);
	   }
   	   return nsAList;
   	}
   	
   	// Method to get nearly sorted number LinkedList based on input size
   	public LinkedList<Integer> getNearlySortedNumberLinkedList(int size) {
   		nsLList.clear();
   		// Convert LinkedList to ArrayList for faster access
   	    ArrayList<Integer> copy = new ArrayList<>(allNumbers);
   	    Collections.sort(copy);
   	    
   	    // Shuffle 10% of the list
   	    int swapCount = (int) (0.1 * copy.size());
   	    
   	    for (int i = 0; i < swapCount; i++) {
   	        int index1 = random.nextInt(copy.size());
   	        int index2 = random.nextInt(copy.size());
   	        
   	        // Swap two random elements in ArrayList (O(1) operation)
   	        Integer temp = copy.get(index1);
   	        copy.set(index1, copy.get(index2));
   	        copy.set(index2, temp);
   	    }
   	    
   	    // Convert back to LinkedList
   	    nsLList = new LinkedList<>(copy.subList(0, size));
   	    
   	    return nsLList;
    }
  	
  	// Method to get the duplicate ArrayList based on the size input
    public ArrayList<Integer> getDuplicateNumArrayList(int size) {
    	duplicateAList.clear();
    	ArrayList<Integer> copy = new ArrayList<>(allNumbers);
    	
    	// Calculate 10% of the size and generate a list of repeated single Integer
  		int dSize = (int) (0.1 * size);
  		Integer duplicate = copy.get(0);
 		for(int i=0; i<dSize; i++) {
 			duplicatesNum.add(duplicate);
 		}
 		
 		duplicateAList.addAll(duplicatesNum);
 		// Add the elements based on size input
 		for (int i=0; duplicateAList.size()<size; i++) {
				Integer number = copy.get(i);
				duplicateAList.add(number);
		}
		return duplicateAList;
    }

    // Method to get the duplicate LinkedList based on the size
    public LinkedList<Integer> getDuplicateNumLinkedList(int size) {
    	duplicateLList.clear();
    	LinkedList<Integer> copy = new LinkedList<>(allNumbers);
    	
    	// Calculate 10% of the size and generate a list of repeated single Integer
  		int dSize = (int) (0.1 * size);
  		Integer duplicate = copy.get(0);
 		for(int i=0; i<dSize; i++) {
 			duplicatesNum.add(duplicate);
 		}
 		
 		duplicateLList.addAll(duplicatesNum);
 		
 		Iterator<Integer> iterator = copy.iterator();
 	 	
 	 	// Add the elements based on size input
 	 	while (iterator.hasNext() && duplicateLList.size()<size) {
 	 		Integer number = iterator.next();
 	 		duplicateLList.add(number);
 	 	}
		return duplicateLList;
    }
    
    // Method to get outliers ArrayList
    public ArrayList<Integer> getOutliersArrayList(int size) {
    	outlierAList.clear();
    	int outlierCount = (int) (0.05 * size); // Set 5% of the size as outliers
        int count = 0;

        while (count < allNumbers.size() && outlierAList.size() < size) {
            Integer number = allNumbers.get(count);

            if (outlierAList.size() <size) {
                outlierAList.add(number);
            }
            
            if (outlierAList.size() < size && outlierAList.size() < outlierCount * 2) {
                int negativeNumber = -number;
                outlierAList.add(negativeNumber);
            }
            
            count++;
        }
        return outlierAList;
     }
     	
    // Method to get outliers LinkedList
    public LinkedList<Integer> getOutliersLinkedList(int size) {
    	outlierLList.clear();
    	int outlierCount = (int) (0.05 * size); // Set 5% of the size as outliers
        int count = 0;

        while (count < allNumbers.size() && outlierLList.size() < size) {
            Integer number = allNumbers.get(count);

            if (outlierLList.size() < size) {
                outlierLList.add(number);
            }

            if (outlierLList.size() < size && outlierLList.size() < outlierCount * 2) {
                int negativeNumber = -number;
                outlierLList.add(negativeNumber);
            }

            count++;
        }
        return outlierLList;
    }
    
    // Method to get skewed ArrayList based on input size
  	public ArrayList<Integer> getSkewedArrayList(int size) {
  		skewedAList.clear();
        int biasFactor = 3; // Controls the skew; higher value means more skewed
        
        for (int i=0; skewedAList.size()<size; i++) {
    		Integer number = allNumbers.get(i);
            // Skewed distribution: higher chance of adding smaller numbers
            if (random.nextInt(biasFactor) == 0 || number < allNumbers.size() / 2) {
            	skewedAList.add(number);   
            }
        }
        return skewedAList;
     }
  	
  	// Method to get skewed LinkedList based on input size
  	public LinkedList<Integer> getSkewedLinkedList(int size) {
  		skewedLList.clear();
        int biasFactor = 3; // Controls the skew; higher value means more skewed
        for (int i=0; skewedLList.size()<size; i++) {
    		Integer number = allNumbers.get(i);
            // Skewed distribution: higher chance of adding smaller numbers
            if (random.nextInt(biasFactor) == 0 || number < allNumbers.size() / 2) {
            	skewedLList.add(number);   
            }
        }
        return skewedLList;
    }
  	
  	// Method to get negative Integer number ArrayList based on the input size
   	public ArrayList<Integer> getNegativeNumberArrayList(int size){
   		negAList.clear();
   		for (int i=0; negAList.size()<size; i++) {
   			Integer number = allNumbers.get(i);
   			Integer negative = -number;
	   		negAList.add(negative);
   		}
   		return negAList;
   	}
   	
   	// Method to get negative Integer number LinkedList based on the input size
   	public LinkedList<Integer> getNegativeNumberLinkedList(int size){
   		negLList.clear();
   		for (int i=0; negLList.size()<size; i++) {
   			Integer number = allNumbers.get(i);
   			Integer negative = -number;
   			negLList.add(negative);
   		}
   		return negLList;
   	}
   	
   	// Method to get even Integer number ArrayList based on the input size
   	public ArrayList<Integer> getEvenNumberArrayList(int size){
   		evenAList.clear();
   		for (int i=0; evenAList.size()<size; i++) {
   			Integer number = allNumbers.get(i);
   			if((int)number%2 == 0)
   				evenAList.add(number);
   		}
   		return evenAList;
   	}
   	
   	// Method to get even Integer number LinkedList based on the input size
   	public LinkedList<Integer> getEvenNumberLinkedList(int size){
   		evenLList.clear();
   		
   		for (int i=0; evenLList.size()<size; i++) {
   			Integer number = allNumbers.get(i);
   			if(number%2 == 0)
   				evenLList.add(number);
   		}
   		return evenLList;
   	}
   	
   	// Method to get odd Integer number LinkedList based on the input size
   	public ArrayList<Integer> getOddNumberArrayList(int size){
   		oddAList.clear();
   		
   		for (int i=0; oddAList.size()<size; i++) {
   			Integer number = allNumbers.get(i);
   			if(number%2 != 0)
   				oddAList.add(number);
   		}
   		return oddAList;
   	}
   	
   	// Method to get odd Integer number LinkedList based on the input size
   	public LinkedList<Integer> getOddNumberLinkedList(int size){
   		oddLList.clear();
   		for (int i=0; oddLList.size()<size; i++) {
   			Integer number = allNumbers.get(i);
   			if(number%2 != 0)
   				oddLList.add(number);
   		}
   		return oddLList;
   	}
  	
  	// Method to get Double number ArrayList based on the input size
  	public ArrayList<Double> getDoubleNumberArrayList(int size) {
  		doubleAList.clear();
  	    // Iterate over allNumbers or any other source that generates numbers
  	    for (int i=0; doubleAList.size()<size; i++) {
  	    	Integer number = allNumbers.get(i);
  	        // Convert Integer to Double and scale by 100
  	        double doubleValue = number.doubleValue() / 100.0;
  	        doubleAList.add(doubleValue);
  	    }
  	    return doubleAList;
  	}
 	
 	// Method to get Double number LinkedList based on the input size
 	public LinkedList<Double> getDoubleNumberLinkedList(int size) {
 		doubleLList.clear();
 		// Iterate over allNumbers or any other source that generates numbers
 		for (int i=0; doubleLList.size()<size; i++) {
  	    	Integer number = allNumbers.get(i);
  	        // Convert Integer to Double and scale by 100
  	        double doubleValue = number.doubleValue() / 100.0;
  	        doubleLList.add(doubleValue);
  	    }
 	    return doubleLList;
 	}
 	
 	// Method to check whether a list contains duplicates
 	public static <T> boolean isContainDuplicate(List<T> list) {
 		
 		// Create a HashSet and add all elements of the list to it
         Set<T> set = new HashSet<>(list);
         
         // Compare sizes
         if (set.size() < list.size())
         	return true;
         else
         	return false;
 	}
 	
 	public class Node<T> {
 	    T data;
 	    Node<T> next;

 	    public Node(T data) {
 	        this.data = data;
 	        this.next = null;
 	    }
 	}
}
