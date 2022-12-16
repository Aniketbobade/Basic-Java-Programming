package ArrayInRecusion;

import java.util.Iterator;

public class EqualityofArray {
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 4, 3, 4, 5 };

		if (a.length == b.length) {
			
			loop1(0,a,b);
			
			if (cnt==a.length) {
				System.out.println("same");
			} else {
				System.out.println("not same");
			}
		} else {
			System.out.println("not same");
		}
	}

	private static void loop1(int i, int[] a, int[] b) {
		// TODO Auto-generated method stub
		if (i<a.length) {
			if (a[i] == b[i]) {
				cnt++;
			}
			i++;
			loop1(i, a, b);
		}
	}

}
