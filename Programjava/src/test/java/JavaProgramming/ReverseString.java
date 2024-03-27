package JavaProgramming;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String = "Stella"
		// revstr="", char ch now using loop length less than the string keep adding the 
		//ch and revstr variable value and print the reversed string after the loop
		
		
		String str = "I am a good girl";
		String reversestr = "";
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			reversestr = ch + reversestr;
			
		}
		System.out.print(reversestr);

	}

}
