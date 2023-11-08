package task12;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap {
public static void main(String[] args) {
		
		// Create a TreeMap of employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employee IDs and names to the TreeMap
        employeeMap.put(103, "monisha");
        employeeMap.put(102, "sajkumar");
        employeeMap.put(101, "KUMAR");
        employeeMap.put(104, "ABCD");

        System.out.println("Names of employees in alphabetical order:");
        for (Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
	}
}


