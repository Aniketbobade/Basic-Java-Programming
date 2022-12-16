package ArrayInRecusion;

public class SecMax {
	static int secMax = 0;
	static int max = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6 };
		loop1(0, a);
		loop2(0, a);

		System.out.println(secMax);
	}

	private static void loop2(int i, int[] a) {
		if (i < a.length) {
			if (a[i] > secMax && a[i] != max) {
				secMax = a[i];
			}
			i++;
			loop2(i, a);
		}

	}

	private static void loop1(int i, int[] a) {
		if (i < a.length) {
			if (a[i] > max) {
				max = a[i];
			}
			i++;
			loop1(i, a);
		}
	}
}
