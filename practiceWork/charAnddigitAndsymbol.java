package practiceWork;

import java.util.Scanner;

public class charAnddigitAndsymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your charactor");
		char ch=sc.next().charAt(0);
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("Alphabate");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("digit");
			
		}
		else {
			System.out.println("Symbol");
		}
	}

}
