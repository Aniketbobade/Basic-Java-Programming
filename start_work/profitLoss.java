package start_work;

import java.util.Scanner;

public class profitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float unitPrice,sellingPrice,amount;
		
		System.out.println("unitPrice");
		unitPrice=sc.nextFloat();
		System.out.println("Enter Selling Price");
		sellingPrice=sc.nextFloat();
			
		if(sellingPrice>unitPrice) {
			amount=sellingPrice-unitPrice;
			System.out.println("Profit by "+amount);
			
					
		}
		else if(unitPrice>sellingPrice) {
			amount=unitPrice-sellingPrice;
			System.out.println("Loss by "+amount);
			
		}
		
	}

}
