package JavaProgramming;

public class BoomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] intArray = {12, 34, 72};

        // Convert int array to string
        String intArrayAsString = arrayToString(intArray);

        // Check if the string contains digit 7
        boolean containsSeven = containsDigit(intArrayAsString, 7);

        // Output the result
        System.out.println("Integer Array as String: " + intArrayAsString);
        System.out.println("Does the string contain digit 7? " + containsSeven);
        System.out.println("BOOM");
    }

    // Function to convert int array to string
    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int num : array) {
            result.append(num);
        }
        return result.toString();
    }

    // Function to check if string contains a specific digit
    private static boolean containsDigit(String str, int digit) {
        return str.contains(String.valueOf(digit));
    }

		
		
		
	}
	
