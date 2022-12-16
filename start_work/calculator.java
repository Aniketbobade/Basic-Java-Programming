package start_work;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter 1st number");
		
		num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		num2=sc.nextInt();
		System.out.println("for Addition + \nfor subtraction -\nfor Multipication *\nfor division /");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':result=num1+num2;
				System.out.println("Addition is "+result);
				break;
		case '-':result=num1-num2;
			System.out.println("Substraction  is "+result);
			break;
		case '*':result=num1*num2;
			System.out.println("Multiplication is "+result);
			break;
		case '/':result=num1/num2;
			System.out.println("Division is "+result);
			break;
				
		}
	}

}
