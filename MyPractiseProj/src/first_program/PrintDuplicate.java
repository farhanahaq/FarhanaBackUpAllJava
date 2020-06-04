package first_program;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {

	public static void main(String[] args) {
		String X = "Hello there";
		 char[] Y = X.toCharArray();
		 //System.out.println(Y[5]);
		 
		 String blogName = "howtodoinjavadotcom";
	        char[] myline = blogName.toCharArray();
	         
	        Map<Character, Integer> hm = new HashMap<>();
	        
	        //System.out.println(hm.get(chars));
	        
	        
	        for(char c : myline) 
	        
	        	  if(hm.containsKey(c)) {
	                //int counter = hm.get(c);
	                int counter = 1;
	                hm.put(c, counter++);
	                System.out.print(c);
	                
	            } else {
	                hm.put(c, 1);
	              // System.out.print(c);
	                
	          }
	        
	        }
	    /*     
	       System.out.println("Duplicate characters:");
	         
	        //Print duplicate characters
	        for(char c : hm.keySet()) {
	            if(hm.get(c) > 1) {
	                System.out.println(c);
	            }*/
	        }

	


