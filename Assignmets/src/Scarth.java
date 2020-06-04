import java.util.Scanner;

public class Scarth {

	public static void main(String[] args) {
		 String X = "madam";
		 String Y = "";
		 for (int i=X.length()-1; i>=0; i--) {
			 Y=Y+X.charAt(i);
		 }
		System.out.println(Y);
		
		if(X.equalsIgnoreCase(Y)) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}
		 
	}

	
}
