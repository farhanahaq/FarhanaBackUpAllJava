package first_program;

import java.util.Scanner;

public class arryLoop_Example {

	public static void main(String[] args) {
		//Array variable with 3 names. use this when we have all the data
		/*String[] names = {"john", "tim", "steve"};
		System.out.println(names[1]);
		System.out.println(names.length);*/
		
		//array like this when we dont have the data
		// data array type int and it has 3 variables(length) and index upto 2 but empty.
		/*int[] data = new int[3]; 
		data[0] = 123;
		data[1] = 456;
		data[2] = 789;*/
		
		/*System.out.println(data[2]);
		System.out.println(data.length);*/
		//length is how many variables there, index is number of those variable which starts at 0. 
		//length is always index+1 and index is always length-1
		
		//String x = "Hello World";
		//System.out.println(x);
		
		/*below we need to access single characters from this string above so need to
		declare an character array to access each character from hello world string*/
		
		//char[] charArr = x.toCharArray(); //toCharArray() 
		//System.out.println(charArr[3]);
		
		//For loop for a string array and printing it all in one line horizontally
		
		//String firstNames = "john james tim susan";
		//char[] mycharArry = firstNames.toCharArray();
		//here printing all character of the string
		//for(int i=0;i<firstNames.length;i++) {
			//System.out.println(i + " = " + firstNames[i]+"!");
			//int x = firstNames.length-1;
		//here printing all character in reverse order but index in normal order
		//System.out.println("length =" + x);
		//for(int i=mycharArry.length-1;i>=0;i--) {
				//System.out.println((mycharArry.length-1)-i+" = "+ mycharArry[i]+", ");
		//for each loop
		String[] firstNames = {"john", "james","tim","susan"};
		for (String i:firstNames) {
			System.out.println(i);
			}
		//while loop - infinite
		//while something is true i will keep doing some work
		
		int y = 0;
		while(y<5) {
			System.out.println(y);
			y++;
		}
		//while loop with user input and comparing with a predefined value test here
		System.out.println("what is my name?");
		Scanner userInput = new Scanner(System.in);
		String newData = userInput.nextLine();
		
		while(!newData.equalsIgnoreCase("Bond")) { //if name entered is not Bond then it is wrong
			System.out.println("you guessed wrong! Try again");
			newData = userInput.nextLine();//user is inputing a value again after one round of loop
		
		}
		System.out.println("you win!!");
		
		//do while loop
		
		
	
		
		
		
		
		
	}
	
}
