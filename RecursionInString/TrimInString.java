package RecursionInString;

public class TrimInString {
	static int start = 0;
static String s2 = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "   Aniket Bobade    ";

		int end = s1.length() - 1;
		loop1(true, s1);
		end = loop2(true, end, s1);

//		System.out.println(start +" "+end);
		
		s2=loop3(start, end, s2, s1);
		
		System.out.println(s2);

	}

	private static String loop3(int start, int end, String s2, String s1) {
		// TODO Auto-generated method stub
		if (start <= end) {
			s2 = s2 + s1.charAt(start);
			start++;
			s2=loop3(start, end, s2, s1);
		}
		return s2;
	}

	private static int loop2(boolean b, int end, String s1) {
		// TODO Auto-generated method stub
		if (b) {
			if (s1.charAt(end) == ' ') {
				end--;
			} else {
				return end;
			}
			end=loop2(b, end, s1);
		}
		return end;
	}

	private static int loop1(boolean b, String s1) {
		// TODO Auto-generated method stub
		if (b) {
			if (s1.charAt(start) == ' ') {
				start++;
			} else {
				return start;
			}
			loop1(b, s1);
		}
		return start;
		
	}

}
