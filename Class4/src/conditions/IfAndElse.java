package conditions;

import java.util.Scanner;

public class IfAndElse {

	public static void main(String[] args) {
		
		//***********Common Variables****************
		//System.out.println("Give me a positive int:");
		//Scanner userInput = new Scanner(System.in);
		//int data = userInput.nextInt();
		//int data1 = userInput.nextInt();
		
		//***********************************************
		
		/*
		//Problem: 'if' statement
		if(20>18)
			System.out.println("20 is greater than 18");
		
		//end of example
		*/
		
		/*
		//Problem:'if else' statement
		int time = 6;
		if(time < 18) {
			System.out.println("Have a Good Day!");
		}
		else {
			System.out.println("Have a Good Night");
		}
		//end of example
		 
		 */
		
		/*
		//Problem: 'if - else if-else' statement
		System.out.println("Please input an integer");		
		Scanner userInput = new Scanner(System.in);
		int data = userInput.nextInt();
		/*
		if(data == 5){
		System.out.println("that is right");
		}
		else if(data == 9){
		System.out.println("correct");
		}
		else {
			System.out.println("wrong");
		}
		//end of example
		
		*/
		
		/*
		//Problem:'if-else if-else if-else if-else' with String 
		
		System.out.println("Give me a color:");
		Scanner userInput1 = new Scanner(System.in);
		String data1  = userInput1.nextLine();
		System.out.println("Give me number:");
		Scanner userInput2 = new Scanner(System.in);
		int data2 = userInput2.nextInt();
		
		
		if(data1.equalsIgnoreCase("red")) {
			System.out.println("red it is");
		} else if(data1.equalsIgnoreCase("green")) {
			System.out.println("green it is");
		}
		else if(data1.equalsIgnoreCase("blue")) {
			System.out.println("blue it is");
		}else {
			System.out.println("try again");
		}
		//end of example
		 
		 */
		
		/*
		
		//Problem use of '&& and ||' in 'if-else'
		// here '||' means 'or' and '&&' means 'and'
		//here either red or green and 5 has to be input for it to be true.
		
		System.out.println("Give me a color:");
		Scanner userInput1 = new Scanner(System.in);
		String data1  = userInput1.nextLine();
		System.out.println("Give me number:");
		Scanner userInput2 = new Scanner(System.in);
		int data2 = userInput2.nextInt();
		
		if(data1.equalsIgnoreCase("red") || data1.equalsIgnoreCase("green") && data2 == 5){
			System.out.println("you guessed color and number right");
				} else {
					System.out.println("try again");
				}
				
				//end of example
				 
				 */
		
		/*
		//Problem: 
		//if a user input a number between 0 to 9
		//print out saying you entered one digit number
		//otherwise print out you entered more than one digit number
		
		System.out.println("Give me a numer:");
		Scanner userInput = new Scanner(System.in);
		int data3 = userInput.nextInt();
				
		if (data3 > 0 && data3 < 10) {
			System.out.println("you entered one digit number");
			}
		else {
			System.out.println("you entered more than one digit");
			
		}
		//end of example
		 
		 */
				
		//***********************
		
		
	}

}
