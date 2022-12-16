package ConditionalStatement;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter unit");
		float unit=sc.nextFloat();
		float bill;
		if (unit<=50) {
			bill=(float) (unit*0.50);
			}
		else if(unit<=150) {
			bill=(float) ((50*0.50)+(unit-50)*0.75);
		}
		else if(unit<=250) {
			bill=(float) ((50*0.5)+(100*0.75)+((unit-150)*1.2));
		}
		else {
			bill=(float) ((50*0.5)+(100*0.75)+(100*1.2)+((unit-250)*1.5));
		}
		
		float TotalBill=(float) (1.2*bill);
		System.out.println("Bill is "+TotalBill);
	}

}
