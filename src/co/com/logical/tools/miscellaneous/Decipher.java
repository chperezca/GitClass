package co.com.logical.tools.miscellaneous;

import java.time.LocalDate;
import java.util.Iterator;

public class Decipher {

	public static void main(String[] args) {
		String text="115)1XJ136sp&";
		Decipher(text);
	}
	
	public static void Decipher(String message) {
		date= LocalDate.now();
		System.out.println(retriveOrder(message.split("sp&")));
		
	}
	
	
	private static String retriveOrder(String[] message) {
		String value=""; 
		for (int i=0;i<message.length;i++) {
			int pos=0;
			for (int j=0;j<message[i].length();j++) {
				if (message[i].charAt(j)=='X') {
					//Letter
					pos=j;
					String word= String.valueOf(message[i].charAt(pos+2)+""
					+message[i].charAt(pos+3)+""+message[i].charAt(pos+4));
					
					int aux= Integer.parseInt(word)/date.getMonthValue();
					
					value=String.valueOf(aux);
					if (j<message[i].length()) {
						
					}
					
				}else if (message[i].charAt(j)=='Y') {
					//Number
					
				}else {
					
				}
				
			}
			

		}
		return String.valueOf(value);
	}
	
	private String[] message;
	private static LocalDate date;
}
