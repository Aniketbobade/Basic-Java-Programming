package start_work;

import java.util.Scanner;

public class positiveAndNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Positibe ");
			
		}
		else if(a<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Enter number is Zero");
		}
	}

}
