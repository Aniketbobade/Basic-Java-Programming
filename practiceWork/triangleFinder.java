package practiceWork;

import java.util.Scanner;

public class triangleFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int side1,side2,side3;
		System.out.println("Enter side 1 value");
		side1=sc.nextInt();
		System.out.println("Enter side 2 value");
		side2=sc.nextInt();
		System.out.println("Enter side 3 value");
		side3=sc.nextInt();
	
		if(side1==side2&&side2==side3) {
			System.out.println("equlatral");
			
		}
		else if(side1==side2||side2==side3||side3==side1) {
			System.out.println("isoscelne");
		}
		else {
			System.out.println("scalene");
		}
	}

}
