package first_program;

import java.util.Scanner;

public class homeWork2Fall2019 {

	public static void main(String[] args) {
		//asking user to enter a string
		System.out.println("Please enter a string");
		
		//printing user input and changing it to all upper case
		Scanner userInput = new Scanner(System.in);
		String str = userInput.nextLine();
		System.out.println(str.toUpperCase());
		//printing length of the string and replace o with z
		System.out.println(str.length());
		System.out.println(str.replace('o','z'));
		//printing last character and concatenate Test with the string
		System.out.println(str.charAt(4));
		System.out.println(str.concat(" Test"));
		
		
		

	}

}
