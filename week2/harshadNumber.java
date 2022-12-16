package week2;

import java.util.Scanner;

public class harshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(temp%sum==0) {
			System.out.println("Harshad number");
		}
		else {
			System.out.println("Not harshad number");
		}
	}

}
