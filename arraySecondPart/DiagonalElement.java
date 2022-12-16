package arraySecondPart;

import java.util.Iterator;

public class DiagonalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4, 5 },
				{ 5, 6, 2, 6, 2 }, 
				{ 3, 5, 6, 8, 9, }, 
				{ 4, 6, 3, 7, 2 }, 
				{ 2,4,7,3,8,4} };
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(j-i==0) {
					System.out.print(a[i][j]+" ");
					sum=sum+a[i][j];
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("sum is "+sum);
	}

}
