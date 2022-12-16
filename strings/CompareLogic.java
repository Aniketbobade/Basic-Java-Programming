package strings;

public class CompareLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Aniket";
		String b = "Aniket";
		char ch1[] = a.toCharArray();
		char ch2[] = b.toCharArray();

		if (ch1.length == ch2.length) {
			int cnt = 0;
			for (int i = 0; i < ch1.length; i++) {
				int num1 = ch1[i];
				int num2 = ch2[i];

				if (num1 != num2) {
					cnt++;
					System.out.println(false);
					break;
				}
			}
			if (cnt == 0) {
				System.out.println(true);
			}
		} else {
			System.out.println(false);
		}
	}

}
