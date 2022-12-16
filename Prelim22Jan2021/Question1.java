package Prelim22Jan2021;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days to be Convert");
		int numOfDays=sc.nextInt();
		
		int year=numOfDays/365;
		System.out.println("Year is "+year);
		int remDayForMonth=numOfDays%365;
		int month=remDayForMonth/30;
		System.out.println("Month "+month);
		int remDayForWeek=remDayForMonth%30;
		int week=remDayForWeek/7;
		System.out.println("weeks "+week);
		int days=remDayForWeek%7;
		System.out.println("Days "+days);
	}

}
