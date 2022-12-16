package strings;

public class Q16DublicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabbcbc";
		String s2 = "";
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					count++;
				}
			}
			if (count > 0) {
				cnt++;
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);
		System.out.println(cnt);
	}

}
