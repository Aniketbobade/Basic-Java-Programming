package subString;

public class PalindromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdcbd";
		int maxnum = 0;
		String ps = "";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				String s2 = "";
				for (int k = i; k <= j; k++) { //find the String 
					s2 = s2 + s1.charAt(k);
				}
				String s3 = "";
				int k2 = s2.length() - 1;    // reverse the String
				for (; k2 >= 0; k2--) {
					s3 = s3 + s2.charAt(k2);
				}
				int count = 0;
				for (int z = 0; z < s2.length() && z < s3.length(); z++) { //compare the two Strings
					if (s2.charAt(z) == s3.charAt(z)) {
						count++;
					}
				}
				if (count == s2.length()) {
					if (s2.length() > maxnum) { //find max long String 
						maxnum = s2.length();
						ps = s2;
					}
				}

			}

		}
		System.out.println(maxnum);
		System.out.println(ps);
	}

}
