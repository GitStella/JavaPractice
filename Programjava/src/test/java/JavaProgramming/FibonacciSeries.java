package JavaProgramming;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Fiboonacci series is 0,1,1,2,3,5,8,13,21, assign values num1 = 0,num2=1
		// num3 = num1+num2 and now num1=num2, num2 = num3
		
		
		int num1=0,num2=1,num3,count =10;
		System.out.print(num1+ " " +num2+ " ");
		for(int i=1;i<=count;i++) {
			
			num3 = num1+num2;
			
			System.out.print(num3+ " ");
			num1 = num2;
			num2=num3;
			
		}
		
	}

}
