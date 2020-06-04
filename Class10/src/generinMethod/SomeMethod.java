package generinMethod;

public class SomeMethod {
//Debugging
/* IDE= Integrated Development Environment ==> the software helps you to write code more efficiently
 Every IDE comes with some debugging capabilities
 //DEBUG: Breakpoint what is? Setting the boundary where u know the issue could be.  
  * Step Into = takes into next line, 
  * Step Over = it will skip method from the lines
  *  Step Return = when you enter a method, this will get out of the method
  *  IQ how do you debug your code? 
  * 	
 */
	public static void main(String[] args) {
		/*int i =10;
		System.out.println(i);//adding breakpoint
		i = i+50;
		int j = i+100;
		i=j;
		System.out.println(i);
		int[] aa = {1,3,5,8};
		printArray(aa);*/
		
		String[] x = {"Hello", "bellow"};
		for(int i=0; i<x.length; i++) {
			String m = x[i];
			char[] n = m.toCharArray();
				for(int j =0; j<n.length; j++) {
					System.out.print(n[j]);
						if (j<n.length-1) {
							System.out.print(",");
						}					
				}
				System.out.println();
		}
		
			}
		
		public static <E> void printArray(int[] ArrayName) {
			for(int item: ArrayName) {
				System.out.println(item);

	}
		}
		}
