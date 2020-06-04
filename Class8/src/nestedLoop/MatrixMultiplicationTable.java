package nestedLoop;

public class MatrixMultiplicationTable {

	public static void main(String[] args) {
	//IQ: Given N, print the multiplication matrix table
		//N = 4
		//1 2 3 4
		//2 4 6 8
		//3 6 9 12
		//4 8 12 16
		//N=2
		//1 2 
		//2 4 

		int N =3;
		//int M = 9;
		//1 2 3
		//2 4 6
		//3 6 9
		
			
		for(int i =1; i<=N; i++) {
			//System.out.println(i);
				
			for(int j =1; j<=N; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		
		}
	}

}
