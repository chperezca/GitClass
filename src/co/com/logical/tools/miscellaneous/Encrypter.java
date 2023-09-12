package co.com.logical.tools.miscellaneous;
import java.time.LocalDate;
import java.util.Random;

/**
 * @author Ch
 * Create to encrypt input data entered in Login Frame
 * before Socket object be sent to ADMIN where be object 
 * information decrypted. 
 */
public class Encrypter{
	public static void main(String[] args) {
		System.out.println(cipher("Hermosa"));;
		
	}
	
	public static String cipher(String word) {
		date= LocalDate.now();
		return revalue(word.split(""));
	}

	private static String revalue(String[] wordSplit) {
		String result="";
		Random rn= new Random();
		
		for (int i=0;i<wordSplit.length;i++) {
			char aux= wordSplit[i].charAt(0);
			int sv = Character.getNumericValue(aux);
			result = ShuffleByCharacter(wordSplit, result, 
					rn, i, aux, sv);
		}
		return result;
	}

	private static String ShuffleByCharacter(String[] wordSplit, 
			String result, Random rn, int i, char aux, int sv) {
		
		char rnChar;
		char rnChar2;
		int position;
		int crypteLetter;
		position= i+1;
		rnChar = (char) (rn.nextInt(87-65)+65);
		rnChar2 = (char) (rn.nextInt(47-33)+33);
		if (Character.isLetter(aux)) {
			//Position: 2
			//Code: 3
			//Word: 6
			crypteLetter= (sv*date.getMonthValue());
			result+= (rnChar2+rnChar)+""+rnChar2+""+position+
					"X"+rnChar+""+crypteLetter+"sp&   "+((int)wordSplit[i].charAt(0)*12)+"   ";
		}else if(Character.isDigit(aux)){
			//Position: 1
			//Code: 2
			//Word: 3
			crypteLetter= (sv*date.getDayOfMonth());
			result+=rnChar2+""+position+"Y"+
					crypteLetter+""+rnChar+(rnChar2+100)+"sp&";
		}else {
			//Position: 1
			//Code: 2
			//word: 3
			result+=rnChar2+""+position+"Z"+wordSplit[i]+
					""+(rnChar2*rnChar2)+(rnChar2+18)+"sp&";
		}
		return result;
	}
	
	private static LocalDate date;
}
