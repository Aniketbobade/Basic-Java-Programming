package OPPs;

import java.util.Scanner;

public class Student {
//Method with no ReturnType but with parameters
	void sum(int num1,int num2)
	{
	int sum;
	sum=num1+num2;
	System.out.println("Sum of "+num1+ " and "+num2+" is "+ sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		Student p1=new Student();
		p1.sum( num1, num2);
	}

}
