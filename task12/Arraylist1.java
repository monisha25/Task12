package task12;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String[] args) {
		// Create an ArrayList of strings
ArrayList<String> stringList = new ArrayList<>();

		// Adding elements to the ArrayList using the add() method. 
stringList.add("Apple");
stringList.add("Banana");
stringList.add("Orange");
stringList.add("Mango");

System.out.println("ArrayList before removing elements: " + stringList);

		// Remove all elements from the ArrayList using clear() method
stringList.clear();

System.out.println("ArrayList after removing elements: " + stringList);
}
}


