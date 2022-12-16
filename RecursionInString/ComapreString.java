package RecursionInString;

import java.util.Iterator;

public class ComapreString {
static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "abcd";

		if (s1.length() == s2.length()) {
			
			loop1(0,s1,s2);
			for (int i = 0; i < s1.length(); i++) {
				
			}
			if (cnt == s2.length()) {
				System.out.println(true);

			} else {
				System.out.println(false);
			}
		} else {
			System.out.println(false);

		}
	}

	private static void loop1(int i, String s1, String s2) {
		// TODO Auto-generated method stub
		if(i<s1.length()) {
			if (s1.charAt(i) == s2.charAt(i)) {
				cnt++;
			}
			i++;
			loop1(i, s1, s2);
		}
	}

	

}
