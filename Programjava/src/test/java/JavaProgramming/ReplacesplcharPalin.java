package JavaProgramming;

public class ReplacesplcharPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Write aa program for a String of length N, return any palindrome which can be obtained by replacing all the '?' in S by any lowercase letters. If no palindrome is obtained the function should return 'No'. 
	//	1.S="?ab??a", output = S=aabbcc , 2.S="bab??a", output , "No" 
//	3. S= "?a?", output S="bab", among other possible answers 
	
	String reversestring =  "";
	char ch;
	
	String repstr="";
	String str = "?ab??a";
	repstr = str.replaceAll("[^a-z]", "b");
	System.out.println(repstr);
	
	for(int i=0;i<repstr.length();i++) {
	repstr.toLowerCase();
		ch = repstr.charAt(i);
		reversestring = ch + reversestring;
		System.out.println(reversestring);
		if (reversestring == repstr)
			System.out.println("Its a palindrome");
		else
			System.out.println("Not a palindrome");

	}
	
	}

}
