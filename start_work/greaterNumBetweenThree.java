package start_work;

import java.util.Scanner;

public class greaterNumBetweenThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter First Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		System.out.println("Enter Third Number");
		c=sc.nextInt();
		
		if((a>b)&&(a>c)) {
			System.out.println(a+" is greater than "+b+" & "+c);
		}
		 if((b>a)&&(b>c)) {
			System.out.println(b+" is greater than "+a+" & "+c);
		}
		if((c>a)&&(c>b)) {
			System.out.println(c+" is greater than "+a+" & "+b);
		}
		
	}

}
