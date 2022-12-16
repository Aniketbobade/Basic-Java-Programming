package SetAFeb2021;

import java.util.Iterator;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaabbccddeeee";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count == 0) {
				int cnt = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						cnt++;
					}
				}
				// System.out.println(s.charAt(i)+" "+cnt);
				if (cnt < 3) {
					s2 = s2 + s.charAt(i);

				}
			}
		}
		String s3="";
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j <s.length(); j++) {
				if(s2.charAt(i)==s.charAt(j)) {
					s3=s3+s.charAt(j);
				}
			}
		}
		System.out.println(s3);
	}

}
