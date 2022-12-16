package recursion;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int sum=0;
		int rem=0;
		int x=loopI(num,sum,rem);
		System.out.println(x);
		
	}

	private static int loopI(int num, int sum, int rem) {
		// TODO Auto-generated method stub
		if(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			sum=loopI(num, sum, rem);
		}
		return sum;
	}

}
