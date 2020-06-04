package encapsulate;

//encapsulation is making it private. u can access it from own class but not from another class
//private does not mean final so we can change it within its class.
//Inheritance: Extends
//Accessing: Imports
//Encapsulation: Private, Getter, Setter
//getter and setter are methods
//getter can give you access to private method/variables to another class
//setter can change the value of the private variable or method



public class X {

	private static int a = 55;
	
	
	public static void main(String[] args) {
		//System.out.println(Y.i);
		//a = 60;
		//System.out.println(a);
		
		Y obj = new Y();
		//System.out.println(obj.getWord());
		obj.setWord("Hi");
		//System.out.println(obj.getWord());
		

	}//end of main method
	

}//end of class
