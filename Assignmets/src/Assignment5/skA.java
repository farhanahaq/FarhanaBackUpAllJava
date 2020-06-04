package Assignment5;
//will create 2 methods, static and non-static
//parent of superkey class
public class skA {
	static int a = 50;
	
//static method
	
		public static void skAstatic() {
			System.out.println("class skA - static method");
	}
	
//non-static method
	
		public  void skAnonstatic() {
			System.out.println("class skA - non-static method");
		}
		
		
		public static void skAstatic1(int a) {
			System.out.println("not mine - class skA - static-1 method");
			System.out.println(a);
	}		
		
}
