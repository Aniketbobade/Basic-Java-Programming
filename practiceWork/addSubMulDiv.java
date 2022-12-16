package practiceWork;

import java.util.Scanner;

public class addSubMulDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
		System.out.println("Enter value of c");
		c=sc.nextInt();
		System.out.println("Enter value of d");
		d=sc.nextInt();
		
		System.out.println("Add a and b");
		int result=a+b;
		System.out.println("Addition is "+result);
		
		System.out.println("multiple the result with c");
		int multi=result*c;
		System.out.println("Multiplication is "+multi);
		
		System.out.println("divide multi result from d");
		int div=multi/d;
		System.out.println("Divide result is "+div);
		
		
		

	}

}
