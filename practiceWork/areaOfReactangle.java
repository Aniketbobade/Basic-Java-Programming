package practiceWork;

import java.util.Scanner;

public class areaOfReactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter breath");
		int b=sc.nextInt();
		System.out.println("Enter the length");
		int l=sc.nextInt();
		
		int result=l*b;
		System.out.println("Area is"+result);
		int perimeter=2*(l+b);
		System.out.println("perimeter is "+perimeter);
	}

}
