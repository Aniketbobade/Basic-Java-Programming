package practiceWork;

import java.util.Scanner;

public class profitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the buying price");
		int buy=sc.nextInt();
		System.out.println("Enter the selling price");
		int sell=sc.nextInt();
		
		if(sell>buy) {
			
			System.out.println("profit");
		}
		else if(buy>sell) {
			System.out.println("loss");
		}
		else {
			System.out.println("No profit and no loss");
		}
	}

}
