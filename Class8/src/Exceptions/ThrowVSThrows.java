package Exceptions;

import java.io.FileWriter;
import java.io.IOException;


//import java.util.Arrays;

public class ThrowVSThrows {
/* Google for java exception for error message
 IQ: Proper example of checked and unchecked?
out of bound is an unchecked exception. runtime error. 
checked is when it wont compile. we need to handle them. file not there is one good example. 
Two ways we handle checked exceptions: 
1. Throws and Throw 
2. Try, Catch, Finally

Throws is used with the method signature before the body
Throw can be put any where
IQ: what is the diff between keyword throw and throws?
Ans: Both of them handles exceptions. Throws will handle checked exception (code wont compile) and 
Throw shows unchecked error exception (code will compile but it is I created)


*/	public static void main(String[] args) throws IOException {
		/*
		int[] numbers = {5,6,9};
		Arrays.sort(numbers);//checked as it will show error before compiling we needed to import Arrays class here
		//want to read a file but file is not there is example of checked exception 
		System.out.println(numbers[3]); //unchecked error as there is no item 3 in this array so out of bounds error 

		*/
		
	
		String filePath = "C:\\Users\\14693\\Desktop\\QAAutomationTraining2020\\hello.txt";
		String text = "Hello World";
		
		createFile(filePath, text);
			
	//creating message for ArithmeticException 	
		 int N=0;
		 if(N==0) {
			 throw new ArithmeticException ("Cant divide by 0");
			 }
		 else {
			 System.out.println(2/N);
			 
		 }
		
	//sample throw function 	 
		 throw new ArrayIndexOutOfBoundsException ("error");

}//end of main		
		
		public static void createFile(String path, String text) throws IOException {
			FileWriter writer = new FileWriter(path, true);
			writer.write(text);
			writer.close();
			
		}
	

		
		
		
		
		


}//end of class
 