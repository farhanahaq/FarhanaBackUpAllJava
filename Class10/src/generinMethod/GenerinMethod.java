package generinMethod;

public class GenerinMethod {
/*IQ: did you use Generic method and why?
 * where i am creating multiple method only diff is data type so then I will create the generic type method.
 * the signature type is public static <E> void methodname(E[] Arrayname).
 * Say that I recently did something similar at work so I remember it do you like me to tell you?
 * What is Singleton?
 * 
 * 
 *
 */

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int[] numbers = {5,7,9,55,85,47,65,32,1,6};
		
		/*
		//for loop
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//for each loop
		for(int item: numbers) {
			System.out.println(item);
		}
				
		//while loop
		int i =0;
		while(i<numbers.length) {
			System.out.println(numbers[i]);
			i++;
		}
		*/
		
		// we have to spell out data type in the method in Main when we calling it for the Generic method
		Integer[] aa = {5,4,3};
		String[] names= {"josh", "jane", "ron"};
		Boolean[] blary = {true, false, true, false};
		
		printArray(aa);
		printArray(names);
		printArray(blary);
		
		int[] x = {12365, 58478};
		
		for(int i=0; i<x.length; i++) {
			int m = x[i];
				String[] n = Integer.toString(m).split("");
				for(int j =0; j<n.length; j++) {
					System.out.print(n[j]);
						if (j<n.length-1) {
							System.out.print(",");
						}					
				}
				System.out.println();
		}
		
		
	

	}//end of main method

	//Generic mehtod // <Object> // Integer 
	// we have to spell out data type in the method in Main when we calling it
	public static <E> void printArray(E[] ArrayName) {
		for(E item: ArrayName) {
			System.out.println(item);
		}
		
		
						
		
	
	}
	/*
	public static void printLnArray(int[] a) {
		for(int item: a) {
			System.out.println(item);
		}
		
	public static void printStringArray(String[] ab) {
			for(String item: ab) {
				System.out.println(item);
			}
			
public static void printBooleanArray(boolean[] abc) {
				for(boolean item: abc) {
					System.out.println(item);
				}
				*/
	}

