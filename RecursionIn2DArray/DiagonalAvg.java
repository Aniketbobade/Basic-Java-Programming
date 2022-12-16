package RecursionIn2DArray;

public class DiagonalAvg {
	static int sum = 0;
	static int cnt = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		loop1(0, a);

		for (int i = 0; i < a.length; i++) {

		}
		int avg = sum / cnt;
		System.out.println(sum);
		System.out.println(avg);

	}

	private static void loop1(int i, int[][] a) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			loop2(0, i, a);

			i++;
			loop1(i, a);
		}
	}

	private static void loop2(int j, int i, int[][] a) {
		// TODO Auto-generated method stub
		if (j < a.length) {
			if (j + i == a[0].length - 1 && j - i == 0) {
				sum = sum + a[i][j];
				cnt++;
			}
			j++;
			loop2(j, i, a);
		}
	}

}
