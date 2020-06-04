package Assignment4;
//Constructor is a method that has same name as the class but can't be static and void.
//it gets invoked when we create a new object for the class in main method. it initialize the value of the object.
//for chaining constructor, it shd be the first one in the method body that is calling it. 
public class ClassTwo {

//creating constructor methods below with various arguments types:	
//this is also an example of overloading method. 
	
		public ClassTwo(boolean y) {
			if (y==true) {
				System.out.println("Constructor#1 with boolean Y");
			}else
				System.out.println("Constructor#1 with boolean N");
		}

		public ClassTwo() {
			this(true);//Chaining constructor#1
			System.out.println("Constructor#2 without any arguments");
		}
	
		public ClassTwo(int i, String x) {
			while (i >0) {
			System.out.println("Constructor#3 with int and String " + x);
			i--;
			}
		}

		public ClassTwo(String x, String y) {
		this(); //chaining constructor#2 here
		System.out.println("Constructor#4 with two Strings " + x + " " + y);
	}
	
}//end of ClassTwo
