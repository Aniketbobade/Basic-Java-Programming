package Prelim22Jan2021;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int ele = a[i][j];
				int count1 = 0;
				int count2 = 0;

				for (int k = 0; k < a.length; k++) {
					if (ele > a[i][k]) {
						count1++;
					}
					if (ele < a[k][j]) {
						count2++;
					}
				}
				if (count1 == 0 && count2 == 0) {
					System.out.println("saddle point " + a[i][j]);
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("not found");
		}

	}

}
