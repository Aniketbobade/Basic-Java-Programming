package strings;

public class CountCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcc";

		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			int cnt = 0;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == 0) {
				s2 = s2 + s.charAt(i);
			}

		}
		System.out.println(s2);
		for (int i = 0; i < s2.length(); i++) {
			int cnt = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s2.charAt(i) == s.charAt(j)) {
					cnt++;
				}
			}
			if (cnt>0) {
				System.out.println(cnt+" "+s2.charAt(i));
			}

		}

	}

}
