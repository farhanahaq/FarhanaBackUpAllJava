package Assignment;

import java.util.Scanner;

/*
Given Problem for Assignment 3, Problem # 3
1.	Build a basic calculator (Plus, Minus, Multiplication, Division)
a.	(Ask user for a number and then ask for the second number 
– then ask for the operation: ADD, SUB, MULTI, DIV)
b.	Use “IF and ELSE” or “SWITCH”
c.	Use method for each operation

 */
public class Assignment3Calculator {

//creating Add method
	public static float a(float i, float j) {
			return (i+j);
			}

//creating Subtract method
	public static float b(float i, float j) {
			return (i-j);
			}
	
	public static void main(String[] args) {

//creating object to get user inputs and storing them in variables 
		System.out.println("1st number?");
		Scanner userInput1 = new Scanner(System.in);
		float num1 = userInput1.nextFloat();
		
		System.out.println("2nd Number?");
		Scanner userInput2 = new Scanner(System.in);
		float num2 = userInput2.nextFloat();
		
		System.out.println("Operation type?");
		Scanner userInput3 = new Scanner(System.in);
		String opr = userInput3.nextLine();
		
//declaring variables to compare user input for operation type
		String Add = "ADD";
		String Sub = "SUB";
		String Multi = "MULTI";
		String Div = "DIV";

//if else-if statement 		
		if (opr.equalsIgnoreCase(Add)){
			System.out.print("IEI - Answer for " + Add + " Operation is "); //IEI = if else if 
			System.out.println(a(num1, num2));
		
		} else if(opr.equalsIgnoreCase(Sub)){
			System.out.print("IEI - Answer for " + Sub + " Operation is ");
			System.out.println(b(num1, num2));
		
		} else if(opr.equalsIgnoreCase(Multi)){
			System.out.print("IEI - Answer for " + Multi + " Operation is ");
			System.out.println(c(num1, num2));
		
		} else if(opr.equalsIgnoreCase(Div)){
			System.out.print("IEI - Answer for " + Div + " Operation is ");
			System.out.println(d(num1, num2));
		
		} else  
			System.out.println("please make a valid selection!");
	
	
//creating switch statement	
	
		switch (opr.toUpperCase()) {
		  	case "ADD":
				System.out.print("sch - Answer for " + Add + " Operation is "); //sch = switch
				System.out.println(a(num1, num2));
				break;
		  	case "SUB":
		  		System.out.print("sch - Answer for " + Sub + " Operation is ");
		  		System.out.println(b(num1, num2));
		  		break;
			case "MULTI":
				System.out.print("sch - Answer for " + Multi + " Operation is ");
				System.out.println(c(num1, num2));
				break;
			case "DIV":
				System.out.print("sch - Answer for " + Div + " Operation is ");
				System.out.println(d(num1, num2));
				break;
			default:
			    System.out.println("please make a valid selection!");
			
		} // end of switch statement
	
	} //end of main method


//creating multi method	
	public static float c(float i, float j) {
		return (i*j);
		}

//creating division method	
	public static float d(float i, float j) {
		return (i/j);
		}
	
}
