package first_program;

import java.util.Scanner;

public class scanner_Example {
	public static void main(String[] args) {
		
		//here user input number and system will print it
		System.out.println("Give me a number = ");
		
		//The Scanner class is used to get user input, and it is found in the java.util package. 
		//To use the Scanner class, create an object of the class and use any of the available methods 
		 //found in the Scanner class documentation. In our example, 
		 //we will use the nextLine() method, which is used to read Strings
		
		Scanner userInput = new Scanner(System.in);
		int showNumber = userInput.nextInt();
		System.out.println("The given number was = " +showNumber);
		//user will input string, system will print it.
		System.out.println("Give me strings =");
		Scanner userInput1 = new Scanner(System.in);
		String showString = userInput1.nextLine();
		System.out.println("The given string was = " +showString);
		
		
		
		
	}
}
