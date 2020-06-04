package mainMethod;

public class MyMain {

	public static void main(String[] args) {
	
		System.out.println(args[1]);
		
		String[] abc = new String[26];
		abc[0] = "A";
		abc[1] = "B";
		
		/*
		for(String item: abc) {
			System.out.println(item);
		}
		*/
		
		//printArray(abc);
		printArray(abc);
		
	}

// creating a method that will take array as argument
	public static void printArray(String[] xyz) {
		System.out.println(xyz[0]);
		
		for(String e: xyz) {
			System.out.println(e);
		}
	}
}
