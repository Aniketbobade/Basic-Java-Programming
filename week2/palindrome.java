package week2;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp;
		temp=num;
		int sum=0;
		while(num>0) {
		int	rem=num%10;
		
		sum=(sum*10)+rem;
		num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("non palindrome");
		}
		
		
	}

}
