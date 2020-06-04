package stringFunction;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
		String account = "tom,ap,sam";
		String[] allAccounts = account.split(",");//splitting with , as koma is a common value that is seperating the values 
		System.out.println(allAccounts[0]);
		Arrays.sort(allAccounts);
		System.out.println(allAccounts[0]);
		
		
		String sentence = "this is a sentence.";
		String[] newSentence = sentence.split(" ");//splitting here with blanks here
		System.out.println(newSentence[3]);

		

	}

}
