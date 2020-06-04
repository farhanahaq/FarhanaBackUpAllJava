package inheritence;

public class A extends B{
//A is a child inheritance from parent B
//A is subclass. B is superclass
//subclass extends to superclass
//you can only inherit one class and no circle no two way only one way
// A extends B > B extends C > C extends A is NOT possible
//if u create an obj in A and A inherits B then we can use obj to access B's non-static objects.	
//IQ: what is the diff between overload and override? define each
//override is from inheritance. if I have a method in superclass but i want to modify it then i will create it in my class subclass and will override it 
//overload is we have multiple methods with same name and part of polymorphism
//IQ what does the super key word do? It is a concept of inheritance. it gets parent's value using super key word.
//super key word works in only in non-static env so inside non-static method. 	
	
	static int a =88;
		
		public void bNStatic() {
			System.out.println("My Own bNStatic");
			
		}
		
	public static void main(String[] args) {
		
		B.bStatic();
		bStatic();
		A.bStatic();
		A obj = new A();
		obj.bNStatic();
		obj.cNStatic();
		C.cStatic();
		obj.aNStatic();
		
		
		
		//System.out.println(a);
		
	} // end of main method
	
	public static void aStatic() {
		System.out.println("aStatic");
					
		}

	public void aNStatic() {
			System.out.println("aNStatic");
			System.out.println(a); // 88
			System.out.println(super.a); //55
			bNStatic();
			super.bNStatic();
						
		}
	
	
}//end of class A
