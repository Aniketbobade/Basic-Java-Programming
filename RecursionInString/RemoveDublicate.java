package RecursionInString;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aabbccc";
		String s2 = "";
		s2=loop1(0,s1,s2);
		
		System.out.println(s2);
	}

	private static String loop1(int i, String s1, String s2) {
		// TODO Auto-generated method stub
		if(i<s1.length()) {
			int cnt = 0;
			cnt=loop2(0,i,s1,cnt);
			
			if (cnt == 0) {
				s2 = s2 + s1.charAt(i);
			}
			i++;
			s2=loop1(i, s1, s2);
		}
		return s2;
	}

	private static int loop2(int j, int i, String s1, int cnt) {
		// TODO Auto-generated method stub
		if(j<i) {
			if (s1.charAt(i) == s1.charAt(j)) {
				cnt++;
			}
			j++;
			cnt=loop2(j, i, s1, cnt);	
		}
		return cnt;
	}

}
