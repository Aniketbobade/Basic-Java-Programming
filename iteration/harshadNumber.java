package iteration;

import java.util.Scanner;

public class harshadNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter num");
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	while(num>0) {
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	if(temp%sum==0) {
		System.out.println("Harshad Number");
	}
	else {
		System.out.println("Non harshad number");
	}
}
}
