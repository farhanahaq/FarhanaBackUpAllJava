package practise;

public class booleanWhileIf {

	public static boolean isWorking(String x) {
		
		int i=0; int j = x.length()-1;
		while(i<=j) {
		if (x.charAt(i) != x.charAt(j))
			return false;
			i++;
			j--;
		}
			return true;
		
	}
	
	
	public static void main(String[] args) {
	
		if(isWorking("havana")) 
		System.out.println("yes");
		else 
			System.out.println("no");
	}

	
}
