package practise;

public class A {

	public static void main(String[] args) {
//Trying to call an static from  a non-static method		

		A newobjy = new A();
		newobjy.y();
	}

	public static void x() {
		System.out.println("print static x");
	}
	
	public void y() {
		System.out.println("print nonstatic y");
		x();
		A.x();
		B.diffB();
	}
}
