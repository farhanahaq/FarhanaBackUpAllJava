package Assignment5;
/*Problem # 
1.Implement inheritance in a java program 
	-	Use the “Super” keyword to show the use of it
	-	Implement 'override' to show the use of it
2.	Implement 'Overload' methods to show the use of it
3.	Show me the use of all 'Access Modifiers' concepts for all (see chart)
*/
public class superKey extends skA{
	static int a = 100;
	int b = 20;
	
//static method
	
		public static void superKeystatic() {
			System.out.println("class superKey - static method");
//calling variable			
			System.out.println(a);//1. calling static variable in static method same class
			superKey obj = new superKey();//creating object of superKey class
			System.out.println(obj.b);//3. calling non-static variable same class in static method needed obj creation
			System.out.println(skA.a);//calling static variable from diff class in static method
//calling method			
			superKey2static();//calling static method from static method same class
			obj.superKeynon2static();//calling non-static method from static method same class
			skAstatic();//calling static method from static method diff class
			obj.skAnonstatic();//calling non-static method from static method diff class
		}
		
//non-static method
		
		public void superKeynonstatic() {
			System.out.println("class superKey - non-static method");
//calling variable			
			System.out.println(a);//1. calling static variable in non-static method same class
			System.out.println(b);//2. calling non-static variable in non-static method same class 
			System.out.println(skA.a);//calling static variable from diff class in non-static method
//calling methods			
			superKeystatic();//calling static method from non-static method same class
			superKeynon2static();//calling non-static method from non-static method same class
			skAstatic();//calling static method from non-static method diff class
			skAnonstatic();//calling non-static method from non-static method diff class
			System.out.println();
			System.out.println("******");
			System.out.println("printing non-static diff class variable and method using super keyword");
			System.out.println(super.a);//calling static int from diff class using super keyword
			super.skAnonstatic();//calling non-static method from diff class using super keyword
		}
	
//creating another non-static method		
		public void superKeynon2static() {
		System.out.println("superKeynon2static");	
		}
		
//creating another static method		
		public static void superKey2static() {
		System.out.println("superKey2static");	
		}

//beginning of main method
		public static void main(String[] args) {
			
			System.out.println("Printing non-static inheritance");
			System.out.println("-------------------------");
			superKey obj = new superKey();
			obj.superKeynonstatic();//calling non-static method from same class
			
			System.out.println("-------------------------");
			
			System.out.println("Printing static inheritance");
			superKeystatic();//calling static method from same class
	//example of overriding
			System.out.println("*********overriding**********");
			
			skAstatic1(30);//calling same class same skAstatic1 method as in parent class 
			skA.skAstatic1(70); //calling parent class same method skAstatic1
			
		

	}//end of main method

//creating methods below for example of override 
		
//example of overriding - creating same name same argument static method as in class skA 
		
		public static void skAstatic1(int a) {
			System.out.println("My Own class skA - static1 method");
			System.out.println(a + a);//making change in local method
			
	}		
		
	
}//end of class superKey
