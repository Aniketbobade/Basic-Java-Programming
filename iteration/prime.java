package iteration;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean prime=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
			
		}
		if(num==0) {
			System.out.println("Not prime");
		}
		else if(prime==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime ");
		}
	}

}
