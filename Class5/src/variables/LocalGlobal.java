package variables;
/* IQ: what the use of static word?
 * ans: say if i have a static variable, and if we change it, every method that uses that variable will get affected.
 * if i have a static method, i dont need to create an object for it if i am in the same class or diff class.
 * IQ: whend do we use something static and non-static?
 * ans: anyhthing that does not change too often we make it static but if something needs to change too oftern
 * we make it as non-static.
 */
//importing a package 
//import Methods.LeanringMethod;
import Methods.*;


public class LocalGlobal {
//Global variables
	
	//static int num = 88;
	
	//int num = 88;
	
	
	public static void main(String[] args) {
		//LocalGlobal LG = new LocalGlobal();
		//LG.num = 2;
		//a(LG.num);
		//int x = 55;
		//a(x);
		//b();	
		//a(num);
		//LG.num = 2;
		//LG.b();

//calling a method from a diff package
		
		//LeanringMethod.sum(6, "hello");
		LeanringMethod.sum("hi","hello","bye");
		
		
	}

	public static void a(int z){
		//int x =10;
//		System.out.println(x+z);
		//System.out.println(num);
		//LocalGlobal LG1 = new LocalGlobal();//we are accessing Global Variable num=88
		//System.out.println(LG1.num + z);//LG1 = num = 88
		//System.out.println(num+z);
		
	}
/*	public static void b(){
		//int y = 99;
		System.out.println(num);
		
	}
*/	
	//public void b(){
		//int y = 99;
		//System.out.println(num);
		
	//}
}
