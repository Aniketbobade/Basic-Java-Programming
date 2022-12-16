package practiceWork;

import java.util.Scanner;

public class swappingForInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st num");
		int a=sc.nextInt();
		System.out.println("Enter 2nd num");
		int b=sc.nextInt();
		
		System.out.println("Your Enter number is "+a+" and "+b);
		
		System.out.println("After Swapping ");
		
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//	Alternate method
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("your result is "+a+" and "+b);
		
		
		
				
	}

}
