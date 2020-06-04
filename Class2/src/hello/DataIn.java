package hello;

import java.util.Scanner;

public class DataIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Give me a number:");
		
		// to take the value in use Scanner and hoover over and import java.util.scanner
		//new word is to create a new object. here object is userInput
		//use the object to read something in based on the data type
		
		Scanner userInput = new Scanner(System.in);
		int a = userInput.nextInt(); // this will get the integer from the user and hold in variable a
		System.out.println(a);	
		
		System.out.print("Give me a string:");
		String b = userInput.next(); // this will get the string from the user.  here next() for 1 string and nextLine() is for more than one string
		System.out.print("you entered: " +b);	
		
	}

}
