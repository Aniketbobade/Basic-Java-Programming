package iteration;

import java.util.Scanner;

public class addDigitOfnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int rem;
		int sum=0;
		while(number>0) {
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println("sum of digit is "+sum);
	}

}
