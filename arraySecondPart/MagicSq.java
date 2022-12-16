package arraySecondPart;

import java.util.Iterator;

public class MagicSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][0]);
			sum = sum + a[i][0];
		}
		System.out.println(sum);
		for (int j = 1; j < a.length; j++) {
			for (int i = 0; i < a.length; i++) {
				sum1 = sum1 + a[i][j];
				
			}
		}
		if(sum==sum1) {
			System.out.println(true);
		}
	}

}
