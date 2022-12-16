package basic;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s[] = s1.split(" ");

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (compareTo(s[i], s[j]) < 0) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (String string : s) {
			System.out.println(string);
		}

	}

	private static int compareTo(String x, String y) {
		int i=0;
		int cnt=0;
		while(i<x.length() && i<y.length()) {
			if(x.charAt(i)==y.charAt(i)) {
				cnt++;
			}else {
				return x.charAt(i)-y.charAt(i);
			}
		i++;
		}if(cnt==x.length() || cnt==y.length()) {
			return x.length()-y.length();
		}
		return 0;
	}
}
