package strings;

public class IndexOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "cde";

		System.out.println(s1.indexOf(s2));

		if (s2.length() <= s1.length()) {
			boolean flag = false;
			for (int i = 0; i < s1.length(); i++) {
				if (s2.length() == 0) {
					System.out.println(0);
				}
				if (s2.charAt(0) == s1.charAt(i)) {

					int count = 0;
					int start = i;
					for (int j = 0; j < s2.length(); j++) {
						if (s1.charAt(start) == s2.charAt(j)) {
							count++;
							start++;

						}
					}
					if (count == s2.length()) {
						System.out.println(i);
						flag = true;
						break;
					}
				}
			}
			if (!flag && s2.length() != 0) {
				System.out.println(-1);
			}
		} else {
			System.out.println(-1);
		}
	}

}
