package RecursionInString;

public class SumOfDigit {
	static int sum=0;
static	int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="345ijrlgk";
		
		loop1(0,s1);
		
		if(cnt==0) {
			System.out.println(0);
		}
		else {
			System.out.println(sum);
		}

	}

	private static void loop1(int i, String s1) {
		// TODO Auto-generated method stub
		if (i<s1.length()) {
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9') {
				int num=s1.charAt(i)-48;
				sum=sum+num;
				cnt++;
			}
			i++;
			loop1(i, s1);
		}
	}

}
