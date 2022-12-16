package start_work;

import java.util.Scanner;

public class upperAndLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charactor");
		char ch=sc.next().charAt(0);
		
		if(ch>='a'&&ch<='z') {
			System.out.println("LowerCase");
		}
		else if(ch>='A'&&ch<='Z') {
			System.out.println("Upper Case");
		
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
