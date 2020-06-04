package stringFunction;


public class LearningLoops {

	public static void main(String[] args) {
		System.out.println("***without for loop***");
		//not using for loop just manual coding
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
		
		//for loop
		System.out.println("***for loop***");
		
		for(int i=0;i<=5;i++) {
			System.out.println("*");			
			
		}

		//for loop with array
		System.out.println("***for loop with array***");
		
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for (int i = 0; i<vowels.length; i++) {
		System.out.println(vowels[i]);
		System.out.println("===============");
		}
		System.out.println("End of array loop :)");
		
	}

}
