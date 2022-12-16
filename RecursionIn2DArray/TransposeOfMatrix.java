package RecursionIn2DArray;

import java.util.Iterator;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 9, 8, 7 }, { 4, 6, 8 }, { 7, 1, 5, } };

		int b[][] = new int[a.length][a.length];
		b = loop1(0, a, b);
		loop3(0, b);

		
	}

	private static void loop3(int i, int[][] b) {
		// TODO Auto-generated method stub
		if (i < b.length) {
			loop4(0, i, b);
			System.out.println();
			i++;
			
			loop3(i, b);
		}
	}

	private static void loop4(int j, int i, int[][] b) {
		// TODO Auto-generated method stub
		if (j < b.length) {
			System.out.print(b[i][j] + " ");
			j++;
			loop4(j, i, b);
		}
	}

	private static int[][] loop1(int i, int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			b = loop2(0, i, a, b);

			i++;
			b = loop1(i, a, b);
		}
		return b;
	}

	private static int[][] loop2(int j, int i, int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		if (j < a.length) {
			b[j][i] = a[i][j];
			j++;
			b = loop2(j, i, a, b);
		}
		return b;
	}

}
