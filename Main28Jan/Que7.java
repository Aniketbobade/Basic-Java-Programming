package Main28Jan;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s11 = "Mother In Law";
		String s22 = "Hitler Woman";
		String s1 = s11.toLowerCase();
		String s2 = s22.toLowerCase();
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			for (int j = i + 1; j < ch1.length; j++) {
				if (ch1[i] > ch1[j]) {
					char temp = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = temp;
				}
			}
		}
		String news1 = "";
		for (int i = 0; i < ch1.length; i++) {
			if(ch1[i]!=' ') {
				news1=news1+ch1[i];
			}
		}
		System.out.println(news1);
		for (int i = 0; i < ch2.length; i++) {
			for (int j = i + 1; j < ch2.length; j++) {
				if (ch2[i] > ch2[j]) {
					char temp = ch2[i];
					ch2[i] = ch2[j];
					ch2[j] = temp;
				}
			}
		}
		String news2 = "";
		for (int i = 0; i < ch2.length; i++) {
			if(ch2[i]!=' ') {
				news2 = news2 + ch2[i];
			}
		}
		System.out.println(news2);
		if (news1.length() == news2.length()) {
			int cnt = 0;
			for (int i = 0; i < news1.length(); i++) {
				if (news1.charAt(i) == news2.charAt(i)) {
					cnt++;
				}
			}
			if (cnt == news2.length()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}

		}else {
			System.out.println("no");
		}
	}
}
