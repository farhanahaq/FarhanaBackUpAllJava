package loops;

//import java.util.Scanner;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		//****************** COMMON VARIABLES ****************
		//System.out.println("Give me a positive number ");
		//Scanner userInput = new Scanner(System.in);
		//int userGaveUs = userInput.nextInt();
		//String[] myStrArray = {"Farhana", "Shoma", "Haq"};
		//int[] myIntArray = {2,4,7,9,10};
		//*****************************************************
		
		/*
		 //Begin Example		  
		 //Example of FOR LOOP using INTEGER VARIABLE
		 System.out.println("Example of FOR LOOP");
		//Problem # we need to print whatever the user gives us and starting from number 1 till the number user gives us.
		System.out.println("Problem # we need to print whatever the user gives us and starting from number 1 till the number user gives us.");
		
		for(int a = 1; a<=userGaveUs; a++) {
			System.out.println(a);		
		}
		
		//End of Example		 
		*/
		
		/*
		//Begin Example
		//Example of FOR LOOP using STRING ARRAY 
		//Problem: Print all the item of an array using FOR LOOP
		System.out.println("Print all the item of an array using FOR LOOP");
		String[] randomArray = {"Basil", "Bipul", "James", "Ronon"};
		for(int b = 0; b<=randomArray.length-1 ; b++) {
		System.out.println("My Name is " + (randomArray[b]));
		}
		
		//End of Example
		*/
		
		/*
		//Begin Example
		//Problem: given N, print out the multiplication table for that number
		//for example if given number 3, then print like this upto 30 .... 3X1=3, 3X2=6, ...3X10=30
		
		//Method#1 ==> using int i as counter 
		int numGiven = 3;
		for(int i=1;i<=10;i++) {
		System.out.println(numGiven+"X"+i+"="+i*numGiven);	
		}
		
		//Method#2 ==> using given number to do all the calculation. 
		int jj =1;
		for(int ii=numGiven;ii<=numGiven*10;ii=ii+numGiven) {
			System.out.println(numGiven+"X"+jj+"="+ii);
			jj++;
		}
		//End Example
		 
		 */
		
		/*
		//Problem: given a number, print all the even number upto 0 from N
		//example= given 8, print like 8-6-4-2-0
				
		int givenNum = 9;
		for (int i=0;i<=givenNum;i=i+2) {
		System.out.println(i);
		}		    		
		//End of Example
		*/
			
		/*
		//Problem: Print all number back to 0 but in reverse order so 9,8,7,6....0
		int givenNum = 9;
		for(int i=givenNum;i>=0;i--) {
			System.out.println(i);
		}
		
		//end of example
		*/
		
		/*
		//Problem: Print all number from a given number to 0 for each item of an ARRAY and reverse way
		
		int[] myintArry = {2,5,6};
		for(int i=0;i<=myintArry.length-1;i++) {
			System.out.println("printing array item " + myintArry[i]);
			for(int j=myintArry[i];j>=0;j--) {
				System.out.println(+j);
			}
			
		}
		
		//end of example
		 */

		/*
		//Problem: you can set a different start point other than the 1st item of the array
		int[] myintArry = {2,5,6}; 
		for(int i=1;i<=myintArry.length-1;i++) { //this one will start from 2nd item of the array
			System.out.println("printing array item " + myintArry[i]);
			for(int j=myintArry[i];j>=0;j--) {
				System.out.println(+j);
			}
			
		}
		//end of example
		*/
		
		/*
		//Problem: FOR EACH LOOP ==> we will have to perform action on each and every item
		//Benefit is we dont have to declare counter variable(example int i) and work with it. 
		String[] names = {"Basil", "Bipul", "James", "Ronon"};
		
		for(String foreachloop: names) {
			System.out.println("My Name Is "+foreachloop);
		}
		//end of example
		 
		 */
		
	/*
		//Problem: WHILE LOOP will do something while it is true and when false do nothing.
		String color = "red";
		while(color.equalsIgnoreCase("red")) {
	System.out.println("HELLO");
	color = "blue";//this will terminate the loop
		}
		//another example
	
		int x =5;
	while(x < 50) {
		x = x*2;//this will print upto 10/20/40/80 bcoz it will terminate after x=80
		System.out.println(x);
		
	}
	*/
	
		/*
		//Problem: DO LOOP ==> it is DO WHILE LOOP ==> it will execute do part at least once even if the condition doesn not meet
	
	//int x = 20;
		//do {
			//x = x*2;
			//System.out.println(x);
	   //}while(x < 50);
	
	 //end of example
	  
	 */
	
		//Problem: Continue will make it ignore that very execution or iteration
		//here when m=3, then it will not print anything 
		/*for(int m=0; m<5; m++) {
		if(m==3) {
			continue;			
		   }
		
		else {
			System.out.println(m);
			}
		
		}
		*/
		
		/*
		//Problem: Break which will stop the whole loop
		//here after m=2, the loop will not execute at all.
		
		for(int m=0; m<5; m++) {
		if(m==3) {
			break;			
		   }
		
		else {
			System.out.println(m);
			}
		
		}
	
		//end of example
		*/
		/*
		//Problem:1.Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…
		
		System.out.println("Give me a positive number ");
		Scanner userInput = new Scanner(System.in);
		int userGaveUs = userInput.nextInt();
		
		System.out.print("1, ");
			for(int i = 4; i<=userGaveUs ; i=i+4) {
			System.out.print(i);
			for (int j=i;j<userGaveUs;j=userGaveUs) {
				System.out.print(", ");}
		}
			System.out.println("...");
			//end of example
			 
			 */
		
	//*********************************************************************	
	//DONT REMOVE AFTER THIS LINE
	}
	
	}
