package number;

import java.util.Scanner;

public class leap_year {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter year: ");
	int year=input.nextInt();
	if((year%4==0)&&(year%100!=0)||(year%400==0)) {
		System.out.println("Entered nimber is leap year: "+year);
		
	}
	else {
		System.out.println("Entered year is not leap year: "+year);
	}
	
	
}
}
