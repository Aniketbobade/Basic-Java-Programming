package prelim21Feb2021;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4 }, { 3, 3, 5, 5 }, { 2, 8, 7, 6 }, { 1, 9, 8, 7 } };
		int index = 0;
		int c[] = new int[a.length + a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i != 0 && i != a.length - 1 && j != 0 && j != a[0].length - 1) {
					c[index++] = a[i][j];
				}
			}
		}
		for (int k = 0; k <=index; k++) {
			int cnt=0;
			for (int l = 2; l < k; l++) {
				if (k % l == 0) {
					cnt++;
					break;
				}
			}
			if (cnt==0) {
				System.out.println(c[k]);
				//break;
			}

		}
	}
}