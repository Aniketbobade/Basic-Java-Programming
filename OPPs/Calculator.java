package OPPs;

import java.util.Scanner;

public class Calculator {
	static Scanner sc=new Scanner(System.in);
//	Create a different  methods in same class and call by using switch statement in do while loop for 
//	continue
	static int num1,num2,result;
	static void input()
	{
		System.out.println("Enter the number first");
		num1=sc.nextInt();
		System.out.println("Enter the second number");
		num2=sc.nextInt();
		
	}
	static void Add()
	{
	
		result=num1+num2;
		System.out.println("sum is "+result);
	}
	static void sub()
	{
	result=num1-num2;
	System.out.println("substraction is "+result);
	}
	static void mul()
	{
		result=num1*num2;
		System.out.println("Multiplication is "+result);
	}
	static void div()
	{
		result=num1/num2;
		
		System.out.println("Division is "+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("$$  WELCOME  $$");
	int choice=0;
	
		do {
			System.out.println("Please select a your choice");
			
			System.out.println("Enter 1 for Addition ");
			System.out.println("Enter 2 for Substraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			System.out.println("Enter 5 for Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: input();
					Add();
					break;
			case 2: input();
					sub();
					break;
			case 3: input();
					mul();
					break;
			case 4: input();
					div();
			case 5: System.exit(0);
					break;
			default : System.out.println("Invalid input");		
			}
		}
		while(choice<=5);
		
	}

}
