package JavaProgramming;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BigDecimal valueToFormat = new BigDecimal("432.6542");
	        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
	        String formattedString = usFormat.format(valueToFormat);
	        System.out.println(formattedString);
	}

}
