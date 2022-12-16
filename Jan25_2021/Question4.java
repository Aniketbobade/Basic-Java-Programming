package Jan25_2021;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("For matrix one");
		System.out.println("Enter the size of array");
		System.out.println("Enter the row");
		int row = sc.nextInt();
		System.out.println("Enter the cols");
		int cols = sc.nextInt();

		int a[][] = new int[row][cols];
		System.out.println("Enter value");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix two");
		System.out.println("Enter the size of array");
		System.out.println("Enter the row");
		int row1 = sc.nextInt();
		System.out.println("Enter the cols");
		int cols1 = sc.nextInt();

		int b[][] = new int[row1][cols1];
		System.out.println("Enter value");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		int c[][] = new int[a.length][b[0].length];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				for (int k = 0; k < b[0].length; k++) {
					c[i][j]=c[i][j]+a[i][k]+b[k][j];
				}
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
