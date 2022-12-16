package SetC4April;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rac";
		String s2 = "Care";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() == s2.length()) {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int count = 0;
			for (int i = 0; i < ch2.length; i++) {
				if (ch1[i] == ch2[i]) {
					count++;
				}
			}
			if (count == ch2.length) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		else {
			System.out.println(false);
		}
	}
}
