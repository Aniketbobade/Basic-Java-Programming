package RecursionInString;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcde";
		char ch='b';
		String s2="";
		s2=loop1(0,s1,s2,ch);
		
		System.out.println();
	}

	private static String loop1(int i, String s1, String s2, char ch) {
		// TODO Auto-generated method stub
		if(i<s1.length()) {
			if (s1.charAt(i)!=ch) {
				s2=s2+s1.charAt(i);
			}
			
			i++;
			s2=loop1(i, s1, s2, ch);
			
		}
		return s2;

	}

}
