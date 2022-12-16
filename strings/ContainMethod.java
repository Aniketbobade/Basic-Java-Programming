package strings;

public class ContainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcabd";
		String s2 = "abd";

		System.out.println(s1.contains(s2));

		if (s2.length() <= s1.length()) {
			boolean flag = false;
			for (int i = 0; i < s1.length(); i++) {
				if (s2.length() == 0) {
					System.out.println(true);
					break;
				}
				if (s2.charAt(0) == s1.charAt(i)) {
					int start = i;
					int count = 0;
					for (int j = 0; j < s2.length(); j++) {
						if (s1.charAt(start) == s2.charAt(j)) {
							count++;
							start++;
						}
					}
					if (count == s2.length()) {
						System.out.println(true);
						flag = true;
						break;
					}
				}	
			}
			if(!flag && s2.length()!=0) {
				System.out.println(false);
			}
		} else {
			System.out.println(false);
		}
	}

}
