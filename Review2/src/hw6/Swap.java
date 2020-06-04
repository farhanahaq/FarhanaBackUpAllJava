package hw6;
//IQ: If they 
public class Swap {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int a = 10;
		int b = 20;
		int temp;
	System.out.println(a);	
		temp = a;
		a=b;
		b=temp;
		System.out.println(a);	
		
		swap(30,40);
		
	}

	
	public static void swap(int a, int b) {
	int temp;
	temp=a;
	a=b;
	b=temp;
	//System.out.println(a);
	//System.out.println(b);
	}
	}

