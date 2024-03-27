package JavaProgramming;

import java.util.HashMap;

public class CreateHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> students = new HashMap <>();
		
		students.put(001, "john");
		students.put(002, "joe");
		students.put(003, "jim");
		students.put(004, "joah");
		
		 for (Integer key : students.keySet()) {
	            String value = students.get(key);
	            System.out.println("Key: " + key + ", Value: " + value);
		
	}
	}
}
