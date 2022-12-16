package arraySecondPart;

import java.util.Iterator;

public class Que28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 1, 1, 1, 1, 2, 2, 3, 4 };
		int b[] = { 1, 2, 4 };

		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j] && count < 2) {
					count++;
				}
			}
			int c[] = new int[a.length - count];
			int cnt = 0;
			int index = 0;
			for (int j = 0; j < a.length; j++) {
				if (b[i] != a[j] || cnt >= 2) {
					c[index++] = a[j];
				} else {
					cnt++;
				}
			}
			a = c;
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
