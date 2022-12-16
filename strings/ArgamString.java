package strings;

import java.util.Arrays;
import java.util.Scanner;

public class ArgamString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String a = sc.next();
		System.out.println("Enter sencond String");
		String b = sc.next();
		String k = a.toLowerCase();
		String p = b.toLowerCase();
		char ch1[] = k.toCharArray();
		char ch2[] = p.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String s1 = new String(ch1);
		String s2 = new String(ch2);

		int x[] = new int[s1.length()];
		int ind1 = 0;
		int c1 = 0;
		String x1 = "";

		for (int i = 0; i < s1.length(); i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					count++;

				}
			}
			if (count == 0) {
				int cnt = 0;
				for (int j = 0; j < s1.length(); j++) {
					if (s1.charAt(i) == s1.charAt(j)) {
						x[c1++] = cnt++;
					}
				}
				// System.out.println(s1.charAt(i) + " " + cnt++);
				x1 = x1 + s1.charAt(i);

			}
		}
		// 2nd part
		int c2 = 0;
		String y1 = "";

		int y[] = new int[s2.length()];
		int ind2 = 0;
		for (int i = 0; i < s2.length(); i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (s2.charAt(i) == s2.charAt(j)) {
					count++;

				}
			}
			if (count == 0) {
				int cnt = 0;
				for (int j = 0; j < s2.length(); j++) {
					if (s2.charAt(i) == s2.charAt(j)) {
						y[c2++] = cnt++;
					}
				}
				// System.out.println(s2.charAt(i) + " " + cnt);
				y1 = y1 + s2.charAt(i);
			}
		}

		if (x.length == y.length && x1.equals(y1)) {
			int result = 0;
			for (int i = 0; i < x.length; i++) {
				if (x[i] == y[i]) {
					result++;
				}
			}
			if (result == y.length) {
				System.out.println("Anagrams");
			} else {
				System.out.println("Not Anagrams");
			}
		} else {
			System.out.println("Not Anagrams");
		}

	}

}
