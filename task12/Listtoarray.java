package task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listtoarray {

	public static void main(String[] args) {
			// Create a List of integers
	        List<Integer> numberList = new ArrayList<>();
	        numberList.add(10);
	        numberList.add(20);
	        numberList.add(30);
	        numberList.add(40);
	        numberList.add(50);
	
	        // Convert List to Array
	        Integer[] numberArray = numberList.toArray(new Integer[0]);
	
	        // Print the Array
	        System.out.println("Array: " + Arrays.toString(numberArray));
	    }
	}
	


