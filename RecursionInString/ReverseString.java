package RecursionInString;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="welcome to hefshine";
		String s[]=s1.split(" ");
		int i=0;
		int j=s.length-1;
		s=loop1(0,j,s);
		
		String s2="";
		
		s2=loop2(0,s2,s);
		
		System.out.println(s2);
	}

	private static String loop2(int i, String s2, String[] s) {
		// TODO Auto-generated method stub
		if (i<s.length) {
			s2=s2+s[i]+" ";
			i++;
			s2=loop2(i, s2, s);
		}
		return s2;
	}

	private static String[] loop1(int i, int j, String[] s) {
		// TODO Auto-generated method stub
		if(i<j) {
			String temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		
			s=loop1(i, j, s);
		}
		return s;
	}

}
