package array;

import java.util.Arrays;

public class AlterSmallAndLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };

		Arrays.sort(a);
		int b[] = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (i < a.length- i- 1) {
				b[index++] = a[i];
				b[index++] = a[a.length - i - 1];
			}
			if (i == a.length - i - 1) {
				b[index++] = a[i];
			}
		}
		for (int i : b) {
			System.out.println(i);
		}

	}

}
