package arraySecondPart;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 2, 1, 7, 3, 8, 6, 4 };
		int temp, j;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = temp;

		}
		for (int x : a) {
			System.out.println(" " + x);
		}
	}

}
