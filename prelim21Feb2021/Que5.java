package prelim21Feb2021;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcde";
		String s2="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)%2==0) {
				s2=s2+(char)(s.charAt(i)-32);
			}else {
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
