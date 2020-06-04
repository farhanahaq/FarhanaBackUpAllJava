package nestedIfElse;

//import java.util.Scanner;
//import java.util.TreeSet;

public class nestedIfElse {

	public static void main(String[] args) {
/*given a number, if even and red or green print even good
		or odd and blue print odd correct
		else print choose a whole number only */
/*		
		Scanner userInput = new Scanner(System.in);
		String X=userInput.nextLine();
		double Y = 11.5;
		//String X = "Blue";
		
		if(Y%2==0){
			if (X=="Red" || X=="Green") {
				System.out.println("Even Good red or green");
			}//end of nested if			
			
		}//end of first if
		
		else if(Y%2 == 1 && X=="Blue") {
			System.out.println("Odd Blue");
			
		}
		
		else {
			System.out.println("Please input a whole number");
		}
	
	//given N =9, print the multiplication table for 9 x 9 
		
		for(int i = 1; i <10; i++) {
			for(int j=1; j<11; j++) {
				System.out.print(i*j + "   ");
			}
			System.out.println();
		}

	//Print if a word is panidilam or not
		
		String Z = "wow";
		char[] myarry = Z.toCharArray();
		
		String newZ ="";
		
		for (int i=0; i<myarry.length; i++) {
			newZ=newZ+myarry[i];
		}
		System.out.println(newZ);
		
		if(Z.equalsIgnoreCase(newZ)) {
			System.out.println("it is a panidulam");
		} else 
			{
			System.out.println("It is NOT a panidulam");	
			}
		
		*/
//duplicate character from a string
			String W = "Hello world";
			for (int i = 0; i<W.length(); i++) 
			 for(int j=i+1; j<W.length(); j++) 
				 if (W.charAt(i) == W.charAt(j)) 
					  System.out.println(W.charAt(j));

	
		}

}	
	
