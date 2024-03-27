package JavaProgramming;

import java.util.Scanner;

public class Findmaxofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner arrsize = new Scanner(System.in);
		System.out.println("Enter the array size" );
		int size = arrsize.nextInt();
		int [] arr1 = new int[size];
		int sum =0;
		int max = 0;
		System.out.println("Enter the values of array");
		for(int i=0; i<size;i++)
		{
			
			arr1[i] = arrsize.nextInt();
		}
		
		for(int i=0; i<size;i++)
		{
			if (max <= arr1[i])
				max = arr1[i];
			
		}
		System.out.println("maximum value in array is " + max);
	}

}
