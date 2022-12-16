package Loops;

public class NumberOfDigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4348;
		int cnt=0;
		while(num!=0) {
			num=num/10;
			cnt++;
		}
		System.out.println("Digits are "+cnt);
	}

}
