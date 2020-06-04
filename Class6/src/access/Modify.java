package access;

//accessing from a diff class need using import and inheritance method
import accessTwo.*;

//public:				static				void
//Access_Modifier		obj/no-obj			return type
//to access non subclass method we need to create object by the name of the class where the methods written
//to access subclass method, we need to create object of the class name from where we are callig it from that is child
//Access Modifiers: default, private, protected, public
//some IQs:
//If we are in the same Class, we should be able to access all these method no matter what access type is
// IQ: what is the restriction of the 'private' key word?
//Ans: the only time we can access something private is when we are within the same class
//IQ: what the restriction access of default modifier?
//Ans: if we are within same package we are able to access them
//IQ: what is the only time protected modifier stops u to access something?
//Ans: diff pck + non-subclass. 

public class Modify extends  A1 {  
	
//public class Modify extends  Parent {
	
//creating all 4 access modifier methods now	
	
	void A() {
		System.out.println("a");
	}
	private void B() {
		System.out.println("b");
	}
	
	protected void C() {
		System.out.println("c");
	}
	
	public void D() {
		System.out.println("d");
	}

	
	public static void main(String[] args) {
//Accessing all 4 AM from same class	
		Modify obj = new Modify();
		obj.A();
		obj.B();
		obj.C();
		obj.D();

	/*	
//Accessing all 4 AM from same pkg but subclass	
		obj.AA();
		obj.BB();//this showing error as private can't be accessed other than own class.  
		obj.CC();
		obj.DD();	
	
//Accessing all 4 AM from same pkg but non-subclass	
		XYZ obj2 = new XYZ();
		obj2.a();
		obj2.b();//this showing error as private can't be accessed other than own class.  
		obj2.c();
		obj2.d();	
		
//Accessing all 4 AM from diff pkg and subclass
//we have to import diff pkg and extends to super class in diff pkg
		obj.aa();//wrong as default not availbe in diff pkg
		obj.bb();//this showing error as private can't be accessed other than own class.  
		obj.cc();//protected is available for diff pkg subclass
		obj.dd(); //public is available every where with object creation	
		
//Accessing all 4 AM from diff pkg and non-subclass
//we have to import diff pkg and extends to super class in diff pkg
		B1 obj1 = new B1();
		obj1.Ai();//wrong as default not availbe in diff pkg
		obj1.Bi();//this showing error as private can't be accessed other than own class.  
		obj1.Ci();//wrong as protected method is not accessbible from diff pkg-non-subclass
		obj1.Di(); //public is available every where with object creation	
						
	*/	
	}//end of main method

	
}//end of class Modify
