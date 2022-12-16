package RecursionInString;

public class SumOfDigitPresentInString {
	static int sum = 0;
	static int cnt = 0;
	public static void main(String[] args) {

		String s = "12345";
		loop1(0, s);
		if (cnt == 0) {
			System.out.println(0);
		} else {
			System.out.println(sum);
		}
	}

	private static void loop1(int i, String s) {
		if (i < s.length()) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int num = s.charAt(i) - 48;
				sum = sum + num;
				cnt++;
			}
			i++;
			loop1(i, s);
		}
	}

}
