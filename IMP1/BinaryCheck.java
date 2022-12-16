package IMP1;

public class BinaryCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="101";
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)=='0' || s1.charAt(i)=='1') {
				count++;
			}
		}
		if(count==s1.length()) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
