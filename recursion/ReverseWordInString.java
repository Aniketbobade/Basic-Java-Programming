package recursion;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I am a good boy";
		String s2[] = s1.split(" ");
		s2=loop1(0,s1,s2);
		loop3(0,s2);
		

	}

	private static void loop3(int i, String[] s2) {
		// TODO Auto-generated method stub
		if(i<s2.length) {
			System.out.print(s2[i]+" ");
			i++;
			loop3(i,s2);
		}
	}

	private static String[] loop1(int i, String s1, String[] s2) {
		// TODO Auto-generated method stub
		if(i<s2.length) {
			String temp = s2[i];
			char ca[] = temp.toCharArray();
			int start = 0;
			int end = ca.length - 1;
			ca=loop2(start,end,ca);
			String s4 = new String(ca);
			s2[i] = s4;
			
			i++;
			return loop1(i,s1,s2);

		}
		return s2;
	}

	private static char[] loop2(int start, int end, char[] ca) {
		// TODO Auto-generated method stub
		if(start<end) {
			char ch = ca[start];
			ca[start] = ca[end];
			ca[end] = ch;
			start++;
			end--;
			return loop2(start,end,ca);
		}
		return ca;
	}

}
