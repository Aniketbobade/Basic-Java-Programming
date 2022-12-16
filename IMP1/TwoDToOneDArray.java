package IMP1;

public class TwoDToOneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int b[] = new int[a.length * a[0].length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {
				b[index++] = a[i][j];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
	}

}
