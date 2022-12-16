package strings;

public class LargestAndSmallestword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sangeeta is a good girl";
		String s[] = s1.split(" ");

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].length() < s[j].length()) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("largest String : " + s[0]);
		System.out.println("smallest string :" + s[s.length - 1]);

	}

}
