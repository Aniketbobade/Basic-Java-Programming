package array;

import java.util.Iterator;

public class UniqPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Calculate the count of repeated element.
		int a[] = { 1, 1,1, 2 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					break;
				}
			}
		}
//		remove count of repeated element from a.length.
		int b[] = new int[a.length - count];
// for create a b[] Array without repeated element
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					cnt++;
				}
			}
			if (cnt == 0) {
				b[index++] = a[i];
			}
		}
//		for print a pair of b[] array.
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[i] + " " + b[j]);
			}
		}
	}
}
