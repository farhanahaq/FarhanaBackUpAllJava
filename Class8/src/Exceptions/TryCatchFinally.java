package Exceptions;
/*
Scenarios: open the browser and click on login button but button is missing.
Try {opening browser}
catch (login button missing)
continue 
	
IQ: can you have try block without catch .. NO
IQ:can you have multiple catch block YES
finally will take care of the correct error messages
  
 
 */

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int[] number = {1,2,3,0};
		int N = 5;
		int M = 0;
		
		try {
			System.out.println(N/number[3]);
		}
		catch(ArithmeticException e) {
			System.out.println("Dont divide by 0");	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Not in Array");
		}
		
	//finally 	
		try {
			System.out.println(N/number[3]);
		}
		catch(IllegalStateException e) {
			System.out.println("Dont divide by 0");	
		}finally {
			System.out.println("finally block");
		}
						
		
	}
}
