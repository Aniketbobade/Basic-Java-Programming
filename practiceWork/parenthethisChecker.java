package practiceWork;

import java.util.Scanner;

public class parenthethisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Parenthethis sysbol");
		String ch=sc.nextLine();
		System.out.println(ch);
		if((ch=="{}"))
		{
			System.out.println("Correct parenthethis");
		}
		else {
			System.out.println("Not Correct parenthethis");
		}
	}

}
