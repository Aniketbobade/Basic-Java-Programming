package Loops;

public class SumOfDigit {

	static int getSum(int n) {
		int sum=0;
		while(n!=0) {
			sum=sum+(n%10);
			n=n/10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		System.out.println("Sum is "+getSum(n));
	}

}
