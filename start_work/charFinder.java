package start_work;

import java.util.Scanner;

public class charFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Charactor");
		char ch=sc.next().charAt(0);
		if((ch>='A'&&ch<='Z')||(ch>='a')&&(ch<='z')) {
			System.out.println("Alphabate");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("Digit");
			
		}
		else {
			System.out.println("Special Symbol");
		}
	}

}
