package OPPs;

import java.util.Scanner;

public class Calculation {
//Create a different methods in same class and create a object for them and call all same time.
	Scanner sc=new Scanner(System.in);
	int num1,num2,result;
	void input()
	{
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		
	}
	void Addition() 
	{
		result=num1+num2;
		System.out.println("Sum is "+result);
	}
	void SubStraction() 
	{
		result=num1-num2;
		System.out.println("sub is "+result);
	}
	void Multiplication() 
	{
		result=num1*num2;
		System.out.println("Multiplication is "+result);
	}
	void Division() 
	{
		result=num1/num2;
		System.out.println("Division is "+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation p1=new Calculation();
		p1.input();
		p1.Addition();
		p1.SubStraction();
		p1.Multiplication();
		p1.Division();
	}

}
