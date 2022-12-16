package strings;

public class Q17Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I am a good boy";
		String s2[] = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			String temp = s2[i];
			char ca[] = temp.toCharArray();
			int start = 0;
			int end = ca.length - 1;
			while (start < end) {
				char ch = ca[start];
				ca[start] = ca[end];
				ca[end] = ch;
				start++;
				end--;
			}
			String s4 = new String(ca);
			s2[i] = s4;

		}
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i] + " ");
		}
	}

}
