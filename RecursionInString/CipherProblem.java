package RecursionInString;

public class CipherProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ANIKET";
		String s2="";
		s2=loop1(0,s1,s2);
		
		System.out.println(s2);
		String s3="";
		s3=loop2(0,s2,s3);
		
		System.out.println(s3);

	}

	private static String loop2(int i, String s2, String s3) {
		// TODO Auto-generated method stub
		if(i<s2.length()) {
			s3=s3+(char)(155-s2.charAt(i));
			i++;
			
			s3=loop2(i, s2, s3);
		}
		return s3;
	}

	private static String loop1(int i, String s1, String s2) {
		// TODO Auto-generated method stub
		if(i<s1.length()) {
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
				s2=s2+(char)(s1.charAt(i)-32);
				
			}else {
				s2=s2+s1.charAt(i);
			}
			i++;
			
			
			s2=loop1(i, s1, s2);
			
		}
		return s2;
	}

}
