package Assignment4;
/*Create two java classes (ClassOne.java, ClassTwo.java):
-	One with the main method (ClassOne.java)
-	One without the main method (ClassTwo.java)
-	Create a Constructor Chain inside the ClassTwo.java
-	Create object in ClassOne.java to invoke the constructor chain
*/

public class ClassOne {

	
	public static void main(String[] args) {

//creating object for ClassTwo which will invoke Constructor#1 for the type of argument 
		ClassTwo CR1 = new ClassTwo(true);
	
//creating object for ClassTwo which will invoke Constructor#2 with no arguments 
		ClassTwo CR2 = new ClassTwo();	
		
//creating object for ClassTwo which will invoke Constructor#3 for the type of arguments 
		ClassTwo CR3 = new ClassTwo(1, "Happy Thursday" );
		
//creating object for ClassTwo which will invoke Constructor#4 for the type of arguments 
		ClassTwo CR4 = new ClassTwo("Hello", "Moto");
		
		
	}//end of main method

	
}//end of classOne
