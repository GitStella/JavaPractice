package JavaProgramming;

public class Findoccuranceofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "United States of america";
		int count = 0;
		char ch = 's';
		
		for(int i=0; i<str.length(); i++) {
			str = str.toLowerCase();
			if (str.charAt(i)== ch)
				count ++;
				
		}
		
		System.out.println(count);
	}

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
