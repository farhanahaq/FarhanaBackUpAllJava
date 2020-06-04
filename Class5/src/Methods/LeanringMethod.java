package Methods;

/*
 Parameter/Arguments/Input = all same concept
 
 public ==> access level, any public can use it
 static ==> 
 void ==> return type
 nameoftheMethod(Arguments)==>
 {body}
 
If a function/method may not return something then it is void type
 if it return something, then it will not be void, it can be int or String or char, boolean.
 
 when a method/function return something, we can access that value by using system.out.println(methodname).
 we can also pass the value of the arguments using that same println statement as system.out.println(methodname(5))
 
only Return type we used so far is void it means it does not return anything
dataType

polymorphism = poly = more than one, morphism = behavior
we can use the same name for diff methods as long as you can distinguish them uniquely 
method overloading is another name of polymorhism
matter is number of the parameter and sequence of the parameter

Constructors
1#same name as class name
2#cant have return type
3#cant be static
you do not need to call the constructors just creating an object of that class will invoke it
every time u create an object for that class, constructoer will be invoked



 */

public class LeanringMethod {

	public static void main(String[] args) {
		//int number = 10;
		//a(number,50);
		//System.out.println(a(number, 50));
		//System.out.println("Hello" + some(10));
		
		//c();
		//b(number, "result with string");
		System.out.println(sum(5,6,7));
		System.out.println(sum("a", "r", "y"));
		System.out.println(sum("a", 4, 5));
	}
/*
	public static String a(int i, int j) {
		System.out.println("a");
		return "result"+(i+j);//it s be the last statement of the body of the method
	}
	public static void b(int num, String e) {
		int j = 50;
		System.out.println(e+ (num + " " + (num+j + 100)));	
	}
	public static void c() {
		System.out.println("c");
	}
	
	public static boolean some(int a) {
		if(a ==10) {
				System.out.println("good");
				return true;
		}
		else 	{
				return false;
		}

	}
	*/
	//polymorphism = poly = more than one, morphism = behavior
	//we can use the same name for diff methods as long as you can distinguish them uniquely 
	//method overloading is another name of polymorhism
	//matter is number of the parameter and sequence of the parameter
	
	
	public static int sum(int i, int j) {
		return i;		
		
	}
	
	public static int sum(int i, int j, int k) {
		return i+j+k;		
		
	}
	
	public static String sum(String i, String j, String k) {
		return i+j+k;		
		
	}
	
	public static String sum(String i, int j, int k) {
		return i+j+k;		
		
	}
//
}
	

