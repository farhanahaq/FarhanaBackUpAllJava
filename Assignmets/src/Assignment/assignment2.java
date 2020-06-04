package Assignment;

import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		//question 1 and answer:
		System.out.println("Q#1. Ask the USER for a string (it should print “Please enter a String:”)");
		System.out.println("Answer:");
		System.out.println("Please enter a String:");
		
		
		//question 2 and answer:
		System.out.println(); //printing an empty line for presentation
		System.out.println("Q#2. Convert that string to all uppercase and print it (it should print “CORONA”)");
		System.out.println("Answer:");
		Scanner userInput = new Scanner(System.in);//userInput is an object of type Scanner which can accept user input 
		String userProvided = userInput.nextLine(); //holding user provided value in a new variable
		System.out.println(userProvided.toUpperCase());
		
		//question 3 and answer:
		System.out.println();
		System.out.println("Q#3. Print the length of that string (it should print 6)");
		System.out.println("Answer:");
		System.out.println(userProvided.length());
		
		//question 4 and answer:
		System.out.println();
		System.out.println("Q#4. Replace ‘A’ with ‘O’ (it should print “CORONO”)");
		System.out.println("Answer:");
		System.out.println(userProvided.toUpperCase().replace('A', 'O'));
		
		//question 5 and answer:
		System.out.println();
		System.out.println("Q#5. Give the last char of the string (it should print “O”)");
		System.out.println("Answer:");
		System.out.println(userProvided.toUpperCase().replace('A', 'O').charAt(userProvided.length()-1));
		
		//question 6 and answer:
		System.out.println();
		System.out.println("Q#6. Concatenate the string from step 1 with string \"Test\" (it should print “corona Test”)");
		System.out.println("Answer:");
		System.out.println(userProvided.concat("Test"));
		
	}

}
