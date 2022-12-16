package iteration;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		int rem;
		int sum=0;
		int temp=number;
		
		while(number>0) {
			rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;	
		}
		if(sum==temp) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
