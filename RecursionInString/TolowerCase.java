package RecursionInString;

public class TolowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ANIKET";
		String s1="";
		s1=loop1(0,s,s1);
		System.out.println(s1);
	}

	private static String loop1(int i, String s, String s1) {
	
		if (i<s.length()) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				s1=s1+(char)(s.charAt(i)+32);
			}else {
				s1=s1+s.charAt(i);
			}
			i++;
			s1=loop1(i, s, s1);
		}
		return s1;
		
	}

}
