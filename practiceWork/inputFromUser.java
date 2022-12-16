package practiceWork;

import java.util.Scanner;

public class inputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		
//		int c=a+b;
//		System.out.println(" Addition is : "+c);
		if(a>b) {
			System.out.println("value first greater");
		}
		else{
			System.out.println("Value 2nd is greater");
		}
	}

}
