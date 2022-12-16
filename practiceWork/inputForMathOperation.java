package practiceWork;

import java.util.Scanner;

public class inputForMathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st num");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd num");
		int num2=sc.nextInt();
//		for Addition
		result=num1+num2;
		System.out.println("Addition is "+result);
//		for Substraction
		result=num1-num2;
		System.out.println("Substraction is "+result);
//		multiplication
		result=num1*num2;
		System.out.println("Multiplication is "+result);
//		div
		result=num1/num2;
		System.out.println("Division is "+result);
	}

}
