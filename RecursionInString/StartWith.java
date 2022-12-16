package RecursionInString;

public class StartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefg";
		String s2 = "";
		System.out.println(s1.startsWith(s2));
		if (s2.length() <= s1.length()) {
			int i = 0;
			int cnt = 0;
			cnt = loop1(0, s1, s2, cnt);
			if (cnt == s2.length()) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println(false);
		}

	}

	private static int loop1(int i, String s1, String s2, int cnt) {
		// TODO Auto-generated method stub
		if (i < s2.length()) {
			if (s1.charAt(i) == s2.charAt(i)) {
				cnt++;
			}
			i++;
			cnt = loop1(i, s1, s2, cnt);
		}
		return cnt;
	}

}
