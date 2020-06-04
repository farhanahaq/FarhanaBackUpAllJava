package Assignment6;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment6 {

	public static void main(String[] args) {
		
/*Question:1.	Create a Int Array[] with unsorted numbers and sort without using Arrays.sort() function
  */
		@SuppressWarnings("unused")
		
		//Creating Array as requested
		int[] MyArray= {5,1,3,56,78,41,25,36,58,20,35,40};
		System.out.println("Answer#1");
		System.out.println("=================================");
		
		//declaring temp variable for swapping 
		int temp;
		
		//we are going to check each number with the number before and will swap if it is smaller.
		for(int t=0; t<MyArray.length; t++) {
			for(int u=t+1; u<MyArray.length; u++) {
				if(MyArray[t] > MyArray[u]) {
					temp = MyArray[t];
					MyArray[t] = MyArray[u];
					MyArray[u]= temp;
					}
			}//end of NESTED loop
	}
		for (int item : MyArray) {
		System.out.print(item + " ");
		}
		//end of Q#1
		System.out.println();
		System.out.println("Answer#2");
		System.out.println("=================================");
		/*Problem: 2.	Generate 500 RANDOM numbers, and find the Nth smallest number 
		(range from 100 – 1000)
		*/	
		
		//Declaring a Random object 
		Random rand = new Random();
		
		//Declaring N integer for finding Nth smaller number
		int N = 5;
		
		//Creating TreeSet for storing random numbers
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		//Generating 500 random number and adding it to TreeSet
			while(ts.size()<500) {
			int randNumer = rand.nextInt((1000-100)+1)+100;
			ts.add(randNumer);
						
		}
		
		//Printing TreeSet
		System.out.println(ts);
		System.out.println(ts.size());
		

		//Printing Nth number
		Object[] obj =ts.toArray();
		System.out.println(obj[N-1]);
		
		//end of Q#2	
		
		
	    System.out.println();
		System.out.println("Answer#3");
		System.out.println("=================================");
	
/*Question:3. Ask the USER for a string (let’s assume they input “hello world”):
a.	Find and Print the Duplicated Character (it should print: l o)
*/	
		@SuppressWarnings("resource")
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("Give me a string");
		String W = userInput2.nextLine();

		TreeSet<Character> ts1 = new TreeSet<Character>();
			System.out.println(W.length());
			for (int m = 0; m<W.length(); m++) {
				for(int n=m+1; n<W.length(); n++) {
					if (W.charAt(m)==W.charAt(n)) {
					 	 ts1.add(W.charAt(n));//TreeSet overrides duplicate item
					 	 
					}
				}
			}
				
			//printing TreeSet by converting to Array and creating a new String variable	
				Object[] nw = ts1.toArray();
				String P = "";
				for (int k=0; k<ts1.size();k++ ) {
					P = P + nw[k];
				}
				System.out.println("Duplicate Strings are:" + P.trim()); // trimming blanks from the beginning 
			
	}
	
}	
