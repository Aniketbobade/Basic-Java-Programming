package start_work;

import java.util.Scanner;

public class findDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int days=sc.nextInt();
		if(days==1) {
			System.out.println("Monday");
		}
		else if(days==2) {
			System.out.println("tuesday");
		}
		else if(days==3) {
			System.out.println("wednesday");
		}
		else if(days==4) {
			System.out.println("Thusday");
		}
		else if(days==5) {
			System.out.println("firday");
		}
		else if(days==6) {
			System.out.println("saturday");
		}
		else if(days==7) {
			System.out.println("sunday");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
