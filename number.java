package basic;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int temp=num;
		int square=num*num;
//		System.out.println(square);
		int count=0;
		
		while(temp>0) {
			
			temp=temp/10;
			count++;
			
		}
		System.out.println(count);
		
		int power=(int) Math.pow(10, count);
		
		int num1=square/power;
		int num2=square%power;
		
		int num3=num1+num2;
		if(num3==num) {
			System.out.println("Kaprekar number");
		}
		else {
			System.out.println("not");
		}

	}

}
