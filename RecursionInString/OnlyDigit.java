package RecursionInString;

public class OnlyDigit {
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234";
		
		loop1(0,s);
		for (int i = 0; i < s.length(); i++) {
			
		}
		if (cnt == s.length()) {
			System.out.println("contains only digits");
		} else {
			System.out.println("not contain only digit");
		}
	}

	private static void loop1(int i, String s) {
		// TODO Auto-generated method stub
		if (i<s.length()) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				cnt++;
			}
			i++;
			loop1(i, s);
		}
	}

}
