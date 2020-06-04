package hw6;

import java.util.Random;
import java.util.TreeSet;

public class RandomNumber {

	public static void main(String[] args) {
/*Problem: 2.	Generate 500 RANDOM numbers, and find the Nth smallest number 
(range from 100 – 1000)
*/	
		// create instance of Random class 
        Random rand = new Random(); 
        int N = 100;
       
        //creating TreeSet to hold the value with no duplicate
        TreeSet<Integer> rn = new TreeSet<Integer>();
        
        //generating 500 random numbers from range 100 to 1000 with no duplicate
        while(rn.size()<500) {
		int rand_int1 = rand.nextInt((1000-100) + 1)+100; //range from 100 – 1000
    	rn.add(rand_int1);
        }
        
        //printing TreeSet
        System.out.println(rn);
        System.out.println(rn.size());
        
  	
        //converting into array to print nth smaller element
  	    Object[] myrn = rn.toArray();
        System.out.println(myrn[N-1]);
        
	}
	
}
