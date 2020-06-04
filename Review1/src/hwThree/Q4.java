package hwThree;

import java.util.Scanner;

public class Q4 {
//given a string, reply if it is palindrome
//wow, level, mom
//step 1 get a string
//step 2 reverse the user string and save it as new variable
//step 3 compare new string with the given string
//if true then palindrome
	
	
	public static void main(String[] args) {
		//step 1 get a string
		System.out.println("input");
		Scanner userInput =  new Scanner(System.in);
		String original = userInput.next();
		
		//step 2 reverse the user string and save it as new variable
		
		//declare am empty string 
		String reverse = "";
		
		//converting given string to an char array
		char[] originalArray = original.toCharArray();
		
		//now reversing the array and putting char in reverse variables
			for (int i=originalArray.length -1; i>=0;i--){
			reverse = reverse + originalArray[i];
			
			}
		//System.out.println(reverse);
		
		//step 3 compare reverse string with the given string
		//if true then palindrome

			
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("is palindrom");
		}
		else {
		System.out.println("not a palindrome");
		}
		
	
	
	}// end of main method

	
	
	
}//end of class Q4
