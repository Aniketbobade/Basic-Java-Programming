package strings;

public class SplitImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Aniket is a good boy";
		int cnt = 0;
		char ch = ' ';
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ch) {
				cnt++;
			}
		}
		System.out.println(cnt);
		String s[] = new String[cnt + 1];

		String newString = "";
		int index = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ch) {
				newString = newString + s1.charAt(i);
			} else {
				s[index++] = newString;
				newString = "";
			}
			if (i == (s1.length() - 1)) {
				s[index++] = newString;
			}
		}
		for (String string : s) {
			System.out.println(string);
		}
	}

}
