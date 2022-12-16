package RecursionInString;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcdderdf";
		String s1 = "";
		s1=loop1(0,s1,s);
		
		System.out.println(s1);
	}

	private static String loop1(int i, String s1, String s) {
		// TODO Auto-generated method stub
		if (i<s.length()) {
			if (s.charAt(i) == 'd') {
				s1 = s1 + 'f';
			} else {
				s1 = s1 + s.charAt(i);
			}
			i++;
			s1=loop1(i, s1, s);
		}
		return s1;
	}

}
