package JavaProgramming;

public class OccurancesNumbers {

	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 4, 4, 4, 5, 5};

	        int num = 4;
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == num) {
	                count++;
	                
	               
	            }
	             
	       // System.out.println("Number of occurrences of " + numberToFind + " is equal to the number itself: " + count);
	   	    
	        }
	        System.out.println("Number of occurrences of " + num + " is equal to the number itself: " + count);
	        
	        }	    
	}

	


