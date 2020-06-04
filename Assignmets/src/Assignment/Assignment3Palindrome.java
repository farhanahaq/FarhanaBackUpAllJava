package Assignment;

import java.util.Scanner;

public class Assignment3Palindrome {

//Problem # 4.	Ask the USER for a string and print if the string is palindrome
	
//creating boolean method to check if a word is palindrome or not	
	public static boolean checkPalindrome(String z) {
//declaring variables to count index pointer for the given string 		
		int x = z.length()-1; // to start from the end
		int a = 0; // to start from the beginning
// while there are characters to compare		
		while  (a<x) {
			if (z.charAt(a)!=z.charAt(x)) // if this is true (if there is a mismatch)
			return false; //it will return false and terminate the method.
			a++; //if condition is not true (if there is match), then it will not return anything and continue iteration till i <= x 
			x--;
			} // end of while
			
			return true; //once while loops end, move to next line of code here and return true
			
		}//end of boolean method
		
	public static void main(String[] args) {

//asking user to provide a string
		System.out.println("Please give me a string");
//getting user input and storing it in a variable		
		Scanner userInput = new Scanner(System.in);
		String y = userInput.nextLine().toLowerCase();
		
		
//calling checkPalindrome method to check if the given string is palindrome or not		
		if (checkPalindrome(y)) // if return true
			System.out.println(y + " is a Palindrome");
		else // if return false
			System.out.println(y + " is not a Palindrome");
			
			
		} // end of main method

}//end of class
