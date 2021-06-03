package prolim.phase1.day3;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{5, 4}, {7, 8}};
		int B[][] = {{10, 20}, {40, 2}};
		
		int C[][] = new int[2][2];
		
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
