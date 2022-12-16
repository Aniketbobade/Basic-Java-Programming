package RecursionInString;

public class ContainOnlyDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="123";
		int cnt=0;
		cnt=loop1(0,s1,cnt);
		
		if (cnt==s1.length()) {
			System.out.println("contains only digit");
		}else {
			System.out.println("not contain only digit");
		}
	}

	private static int loop1(int i, String s1, int cnt) {
		// TODO Auto-generated method stub
		if (i<s1.length()) {
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
				cnt++;
			}
			i++;
			cnt=loop1(i, s1, cnt);
		}
		return cnt;
	}

}
