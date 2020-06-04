package practise;

public class ObjectAndMethod {

/* Synopsis:
Methods:
we can't create a method inside another method. Method needs to be created inside a Class outside of another method.
ONLY main method will invoke by default. Rest of the methods need to be invoked by the main method. 
main method gets executed top to bottom.

These newly created methods need to be called by the main method.

if you have a class and a main method and several methods. we can call all methods inside that class as <methodname;>
but if you have a method from a different class but in the same package, we need to call it as <class.methodname;>

you can't run a method if there is no main method in that class. we can only call that method from another class that
has a main method. 

if u have a non-static method, u can't call it from a static method UNLESS you create an object

create an object using this formula: Classname ObjectName = new Classname();

object is an instant copy of the class. so this object will have all the methods of the class.

now we cab access non-static method by using that object objectname.nonstaticmethodname(); OM.xyz();
we can also use object to call static method too.

when accessing a non-static method from another class, we need to create the object inside a method where we can calling it FROM.
An object can ONLY be use inside the method it was created in. NOT from any other method.

we can call a non-static method from another non-static method with creating an object 
we DONT need to create an object to call a static method from a non-static method
we can't call a non-static method from another non-static from a different Class. we need to create 
an object for that non-static method from another Class inside that non-static method we are calling it FROM

static to static ==> DONT create an object just call by methodname();
static to static diff class ==> DONT create an Object but use Class.methodname();

non-static to non-static ==> DONT create an Object just use methodname();
non-static to non-static diff class ==> create an Object and call as objectname.methodname();

static to non-static ==> DONT create an Object just use methodname();
static to non-static diff class ==> DONT create an Object but use Class.methodname();

non-static to static ==> create an Object and use objectname.methodname();
non-static to static diff class==> create Object and use objectname.methodname();


*/
	
	
//we can create a method here
	
//creating a method outside of main method
	public static void sumOfTwoFive() {
		System.out.println(10);
		
	}
	
	public static void main(String[] args) {
		
	
//can not create a method here but we need to call methods
		System.out.println("first Hello of main method");
//calling other methods and can call as many time as we want and in any sequences 
		ObjectAndMethod.abc();
		sumOfTwoFive();
		Universe.solarSystem();
		ObjectAndMethod OM = new ObjectAndMethod(); //created an Object to access non-static method xyz
		OM.xyz();
		Universe UO = new Universe(); //created an Object to access non-static method pluto from another class
		UO.pluto();
	}
	
//we can create a method here

//creating another method outside of main method
	public static void abc() 
	{
		System.out.println("print me abc");
		sumOfTwoFive();
		ObjectAndMethod MyOM = new ObjectAndMethod();
		MyOM.xyz();
		
		
	}
	
//creating a method without the word 'static'
	public void xyz() {

//we can call a non-static method from another non-static method without creating an object
		jkl();
		System.out.println("this is xyz");
		abc();//calling static method in a non-static method
	}	

//creating another non-static method	
	public void jkl() {
		System.out.println("jkl non-static method here");
	}
}

//can't create a method here