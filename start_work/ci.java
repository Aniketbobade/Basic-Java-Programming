package start_work;

import java.util.Scanner;

public class ci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principle, n,ci,Amount;
		float rate,time;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Principle");
		principle=scan.nextInt();
		System.out.println("Enter the n");
		n=scan.nextInt();
		System.out.println("Enter the rate");
		rate=scan.nextFloat();
		System.out.println("Enter the time period in year");
		time=scan.nextFloat();
		Amount=(int) (principle*Math.pow((1+(rate/(n*100))), (n*time)));
		System.out.println("Amount is "+Amount);
		ci=Amount-principle;
		System.out.println("CI is "+ci);
		
	}

}
