package practiceWork;

import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		int a=sc.nextInt();
		System.out.println("Enter second num");
		int b=sc.nextInt();
		
		System.out.println("After Swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
