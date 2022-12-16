package ExceptionHandling;

import java.util.Scanner;

public class DivideProblem {
	void m1() {
	m2();
	System.out.println("m1 called");
	}
	void m2() {
	m3();
	System.out.println("m2 called");
	}
	void m3()
	{
		m4();
		System.out.println("m3 called");
	}
	void m4() {
		int x,y,result=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("num1");
		x=sc.nextInt();
		System.out.println("num2");
		y=sc.nextInt();
		
		try {
			result=x/y;
		}
		catch (ArithmeticException ae) {
			// TODO: handle exception
		System.out.println("infinite");
		}
		
		System.out.println("End of code");
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideProblem div=new DivideProblem();
		div.m1();
	}

}
