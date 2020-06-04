package stringFunction;

public class LearningArray {

	public static void main(String[] args) {
	
		System.out.println("*** declaring array when we dont know the value ***");
		String[] students = new String[3];
		
		students[0]="Angela";
		students[1]="Ankita";
		students[2]="Anwar";
		//students[3]="asma";
		//students[4]="Aziz";
		
		System.out.println(students[2]);
		//System.out.println(students[3]);//this will error out bcoz it only has 3 items and location 3 is item 4
		
		System.out.println("*** another way to declare array when we know the values already ***");
		//This is another way to declare an array
		//here we know values already
		String[] names = {"Basil", "Bipul", "Babu"};
		System.out.println(names[2]);
		
		char[] vowels = {'a','e','o','u','i'};
		System.out.println(vowels.length); // how many items we have in our array
		System.out.println(vowels[2]);
		System.out.println(vowels);
		
		int[] passCode = new int[4];
		passCode[3] = 5555555;
		System.out.println(passCode[0]); // IQ what is the default value of an integer in JAVA? it is 0
		passCode[1] = 2222;
		System.out.println(passCode[1]);
		
		
		

	}

}
