package basic;

import java.util.Scanner;

public class doubleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b;
		
		for(int i=2;i<10;i++) {
		b=2*a;
		System.out.println(b);
		a=b;
		
		
		}
	}

}
