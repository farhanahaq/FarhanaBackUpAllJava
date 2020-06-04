package conditions;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		//problem switch
		//this program will break after t finds the match. if not then will do default option. 
		System.out.println("what day it is?");
		Scanner userInput = new Scanner(System.in);
		String day = userInput.nextLine();
			
	switch(day.toLowerCase()) {
	case "monday": 
		System.out.println(day + " it is");
		break;
	case "tuesday": 
		System.out.println(day + " it is");
		break;
	case "wednesday": 
		System.out.println(day + " it is");
		break;
	default:
		System.out.println("come back to ur senses!!");
	
	}
	
	
//******************************
		
		
	}

}
