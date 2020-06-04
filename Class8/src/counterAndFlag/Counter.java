package counterAndFlag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Counter {

	public static void main(String[] args) {
		//tell me how many odd numbers are there and tell me what are and remove duplicate
		
		
		Set<Integer> ts = new TreeSet<Integer>();
		int[] number = {5,6,9,5,8,6,4,3,7,6,9,5,3,1,4,55,66};
		//Arrays.sort(number);
		
		//Flag is nothing but concept is boolean
		
		boolean answer = true;
	
		if (answer) {
		int counter = 0; 
		 for (int item: number) {
			 if(item%2 == 1) {
				  counter++;
				  //System.out.println(item);
				  ts.add(item);
				 
			 }//end of if
				 
		}//end for loop
		System.out.println("Total Odd Numbers are = " + counter);
		System.out.println("with no duplicate =" + ts.size());
		System.out.println(ts);
		
		} //end of flag	
//tell me how many odd numbers are there and tell me what are and remove duplicate
		int[] Z = {1,2,3,5,9,7,5,3,1,2,4,6,8,10};
//we dont know how many odds here is so we cant declare an array to hold the odds value and
// also we cant have duplicate so we will need TreeSet
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ArrayList<Integer> newArry = new ArrayList<Integer>();
		int counter1 = 0;
		for (int item: Z) {
			if(item%2==1) {
				ts1.add(item);//will print without duplicate
				newArry.add(item);//will print with duplicate
				counter1++; //holds how many time it iterates meaning ow many odd numbers
			}
		}
		System.out.println(counter1);
		System.out.println(newArry);
		System.out.println(ts1);
		
		
		
		
	    } //end of main
		

	}//end of class

