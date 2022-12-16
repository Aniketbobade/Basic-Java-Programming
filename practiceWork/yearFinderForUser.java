package practiceWork;

import java.util.Scanner;

public class yearFinderForUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter number of days want to convert into year, week and days");
		int days=sc.nextInt();
		
		int year=days/365;
		System.out.println("number of Year is "+year);
		int remDays=days%365;
		
		int month=remDays/30;
		System.out.println("number of months is "+month);
		int a=remDays%30;
		int week=a/7;
		System.out.println("Number of week is "+week);
		
		int day=a%7;
		System.out.println("Reming day is "+day);
		
	}

}
