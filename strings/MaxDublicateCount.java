package strings;

public class MaxDublicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabbddcssssddddd";
		int max = 0;
		char ch = ' ';
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
						cnt++;
					}
				}
				if (cnt > max) {
					max = cnt;
					ch = s1.charAt(i);
				}
			}
		}
		System.out.println(ch + " " + max);
	}

}
