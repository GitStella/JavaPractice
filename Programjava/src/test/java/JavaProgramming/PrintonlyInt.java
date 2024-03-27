package JavaProgramming;

public class PrintonlyInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd123";
		char ch;
		String temp = "";
		boolean d;
		str = str.replaceAll("[^0-9]", "");
		str = str.trim();
		System.out.println(str);
		String str1 = "abcd123";
		str1 = str1.replaceAll("[^a-z]", "");
		str1 = str1.trim();
		System.out.println(str1);
		

	}

	}


