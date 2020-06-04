package hw6;
/*Swap function
 */
public class Q1 {

	public static void main(String[] args) {
	//how to sort an array without using any built-in function
		
		@SuppressWarnings("unused")
		int[] numbers = {5,1,3,56,78,41,25,36,58,20,35,40}; 
		@SuppressWarnings("unused")
		int temp;
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++){
			if(numbers[i]>numbers[j]) {
				
				temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
				}//end of if
			
			}//end of 2nd loop
		
		}//end of 1st loop
		
		for (int item:numbers) {
			System.out.print(item + " ");
		}

	}

}
