package JavaProgramming;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String str = "A man, a plan, a canal: Panama";
		//String str = "@#$#@";
		String str = "Was it a car or a cat I saw?" ;
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		String rstr = "";
		char ch;
		
		for( int i=0;i<str.length(); i++) {
			str = str.toLowerCase();
			ch = str.charAt(i);
			rstr = ch + rstr;
			
		}
		
		System.out.println(rstr);
		if (str.equals(rstr))
			System.out.println("The string is a Palndrome");
		else
			System.out.println("Not a Palindrome");
		
		
	}

}
