package arraySecondPart;

import java.util.Iterator;

public class Substractionof2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 1 }, { 7, 5, 4 }, { 1, 2, 3 } };
		int b[][] = { { 9, 6, 6 }, { 25, 67, 6 }, { 6, 3, 3 } };

		int c[][] = new int[a.length][a.length];

		System.out.println("Displaying Matrix 1:");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println("Displaying Matrix 2:");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(b[i][j] + " ");
			}

			System.out.println();
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = b[i][j] - a[i][j];
			}
		}
		System.out.println("Substraction ");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");
			}

			System.out.println();
		}
	}
}