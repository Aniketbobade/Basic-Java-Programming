package RecursionInString;

public class EqualTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2="abc";
//		using direct method
		System.out.println(s1.equals(s2));
//		Using in implementation of Equal to method in recursion
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		if(ch1.length==ch2.length) {
			int cnt=0;
			cnt=loop1(0,ch1,ch2,cnt);
			if(cnt==0) {
				System.out.println(true);
			}
		}else {
			System.out.println(false);
		}
	}

	private static int loop1(int i, char[] ch1, char[] ch2, int cnt) {
		// TODO Auto-generated method stub
		if (i<ch1.length) {
			int num1=ch1[i];
			int num2=ch2[i];
			if (num1!=num2) {
				cnt++;
				System.out.println(false);
				return cnt;
			}
			i++;
			cnt=loop1(i, ch1, ch2, cnt);
			
		}
		return cnt;
	}

}
