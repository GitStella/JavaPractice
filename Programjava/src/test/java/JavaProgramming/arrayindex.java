package JavaProgramming;

public class arrayindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  arr = {7,2,3,1,5};
		
		int target=9;
		
		for(int i=0; i<arr.length; i++) {
			
			int a = arr[i] + arr[i+1];
			if (a == target) 
			{
				System.out.print("The target number is achieved " + arr[i] + " " + arr[i+1]);
				System.out.println("Indexes are " + i + " " +(i+1));
				break;
			}
		}
		
	
	}

}
