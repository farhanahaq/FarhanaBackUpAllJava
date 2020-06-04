package Constructors;

/*Constructors:
 A constructor in Java is a special method that is used to initialize objects. 
 The constructor is called when an object of a class is created. 
 It can be used to set initial values for object attributes:
 Whenever a method has a same name as the Class, it is a constructor.
 
 Rules:
1#same name as class name
2#Can't have return type
3#Can't be static
4# once you make an obj with a parameter, you cant make another obj after it wioutout parameter.
you have to make a constructor without parameter to create that obj without parameter. 
the default constructor with no parameter gets wiped out by creating the parameterised obj before it. 

you do not need to call the constructors just creating an object of that class will invoke it
every time u create an object for that class, constructor will be invoked
*/


public class LearningConstuctor {

	public LearningConstuctor(int a) {
//			this(); //this is a constructor by the class name 
			for (int i=0;i<a; i++ ) {
				System.out.println("printing constructor with 'int a' argument");	
			}
	}
			public LearningConstuctor() {
				this(6, "oh god");
				System.out.println("hello");	
				}
			
			public LearningConstuctor(int a, String b) {
				this(5);
				System.out.println("more");	
				}

		public void abc() {
			System.out.println("this is abc method");
		}
}
