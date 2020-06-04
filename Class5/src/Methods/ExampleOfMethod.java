package Methods;

public class ExampleOfMethod {

/*
Providing examples of the below scenarios:
static to static same class ==> DONT create an object just call by methodname();
static to static diff class ==> DONT create an Object but use Class.methodname();

non-static to non-static same class ==> DONT create an Object just use methodname();
non-static to non-static diff class ==> create an Object and call as objectname.methodname();

static to non-static same class ==> DONT create an Object just use methodname();
static to non-static diff class ==> DONT create an Object but use Class.methodname();

non-static to static same class ==> create an Object and use objectname.methodname();
non-static to static diff class==> create Object and use objectname.methodname(); 

 */

	
//creating static method 1
	public static void sttcMethod1() {
		System.out.println("this is 1st static method");
		sttcMethod2(); //static to static same class example
	}
//creating static method 2
	public static void sttcMethod2() {
		System.out.println("this is 2nd static method");
		ExampleOfMethod newObj = new ExampleOfMethod();
		newObj.NonsttcMethod1();//non-static to static same class example
		}
//creating non-static method 1
	public void NonsttcMethod1() {
			System.out.println("this is 1st non-static method");
			sttcMethod2(); // static to non-static same class
	}
//creating non-static method 2
	public void NonsttcMethod2() {
			System.out.println("this is 2nd non-static method");
			NonsttcMethod1();//non-static to non-static same class
		}	
	public static void main(String[] args) {
	

		//sttcMethod1();
		
		//sttcMethod2();
		
		CreatingDiffClass newObj1 = new CreatingDiffClass();
		newObj1.NonStcMethod1();
		
		
	}

}
