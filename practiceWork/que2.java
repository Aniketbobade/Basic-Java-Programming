package practiceWork;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int side1=sc.nextInt();
		System.out.println("Enter num2");
		int side2=sc.nextInt();
		
		
		if(side1>side2) {
			System.out.println("num1 is max");
		}
		else if(side1<side2) {
			System.out.println("num1 is min");
		}
		else {
			System.out.println("same");
		}
	}

}
