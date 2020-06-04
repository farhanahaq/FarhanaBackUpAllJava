package encapsulate;

public class Y {

	private static int i = 10;
	static int j = 55;
	private String word = "Hello";
	
	public static void abc() {
		//System.out.println(X.a);
		i =15;
		System.out.println(i);
		}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	
		
	
/*	
	public String getWord() {
		String word = "blah blah";
		return this.word;
	}

	public void setWord(String word) {
		Y.word = word;
		System.out.println(Y.word);
	}

*/

}//end of class Y
