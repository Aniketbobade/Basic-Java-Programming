package strings;

public class SumOfDigitPresentInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="345ijrlgk";
		int sum=0;
		int cnt=0;
		for (int i = 0; i <s1.length(); i++) {
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9') {
				int num=s1.charAt(i)-48;
				sum=sum+num;
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println(0);
		}
		else {
			System.out.println(sum);
		}
	}

}
