
package Assignment;

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		
		
	//Problem:1.Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…
		System.out.println("Problem 1 ==>");
				
		System.out.println("Give me a positive number ");
		Scanner userInput = new Scanner(System.in);
		int userGaveUs = userInput.nextInt();
		System.out.print("1, ");
			for(int i = 4; i<=userGaveUs ; i=i+4) { //this line will print numbers in the pattern as asked in the question
			System.out.print(i);
			//System.out.println(i + ", ");//this is for printing with ',' after all number including the last number
				for (int j=i;j<userGaveUs;j=userGaveUs) { //this line will print ',' after each number except the last one
					System.out.print(", ");}
				}
					System.out.println("...");
					System.out.println("------End of Problem 1-------");
					System.out.println();
					
					
		//Problem:2 Given N --- Print backward to 0. 
			//a (Ask user for a number and lets assume N is 5 so if the user input 5 
			//– then the program should print: 5 4 3 2 1 0)
			System.out.println("Problem ==>2");	
								
			System.out.println("Enter a number ");
			Scanner userInput1 = new Scanner(System.in);
			int userGaveUs1 = userInput1.nextInt();
					
				for (int a=userGaveUs1 ;a>=0;a--) {
					System.out.println(a);						
					}
					
			System.out.println("------End of Problem 2-------");
			System.out.println();
					
		//Problem 5:Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.
			System.out.println("Problem 5 ==>");
									
			System.out.println("Enter a number ");
			Scanner userInput2 = new Scanner(System.in);
			int userGaveUs2 = userInput2.nextInt();
					
		//using formula for odd num which is the remainder from num%2 is not zero for odd number
				if (userGaveUs2 % 2 != 0 ) {
				System.out.println("ODD");
				} else {
				System.out.println("EVEN");
						}
					
			System.out.println("------End of Problem 5------");
			System.out.println();
						
	}

}
