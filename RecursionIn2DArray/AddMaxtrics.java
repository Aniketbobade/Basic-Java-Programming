package RecursionIn2DArray;

public class AddMaxtrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int c[][] = new int[a.length][a.length];
		loop1(0,c,a,b);
		loop3(0,c);
	}

	private static void loop3(int i, int[][] c) {
		// TODO Auto-generated method stub
		if(i<c.length) {
			loop4(0,i,c);
			
			System.out.println();
			i++;
			loop3(i, c);
		}
	}

	private static void loop4(int j, int i, int[][] c) {
		// TODO Auto-generated method stub
		if(j<c.length) {
			System.out.print(c[i][j] + " ");
			j++;
			loop4(j, i, c);
		}
	}

	private static void loop1(int i, int[][] c, int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		if(i<c.length) {
			loop2(0,i,c,a,b);
			
			i++;
			loop1(i, c, a, b);
		}
	}

	private static void loop2(int j, int i, int[][] c, int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		if(j<c.length) {
			c[i][j] = a[i][j] + b[i][j];
			j++;
			loop2(j, i, c, a, b);
		}
	}

}
