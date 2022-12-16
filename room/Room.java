package room;

import java.util.Scanner;

	public class Room {
		int length,width,height,area;
		Scanner sc=new Scanner(System.in);
		
	void input()
	{
		System.out.println("Enter length: ");
		length=sc.nextInt();
		System.out.println("Enter width :");
		width=sc.nextInt();
		System.out.println("Enter height");
		height=sc.nextInt();
	}
	void whiteWashingArea()
	{
		area= (4*length*height)+(length*width);
		System.out.println("Area is "+area);
	}
	
	int whiteWashingCost()
	{
		int cost=area*80;
		return cost;
	}
	int flooringCost()
	{
		int choice,flooringCost=0;
		System.out.println("Enter choice for ");
		System.out.println("1. Geometric flooring");
		System.out.println("2.Cement flooring");
		choice=sc.nextInt();
		if(choice==1) {
			flooringCost=200*(length*width);
			
		}
		else if(choice==2) {
			flooringCost=100*(length*width);
			
		}
		else {
			System.out.println("invalid input");
		}
		return flooringCost;
		
	}
	
	void display()
	{
	whiteWashingArea();
	System.out.println("white whashing cost :"+whiteWashingCost());
	System.out.println("flooring costis "+flooringCost());
	}
}
