package OPPs;

import java.util.Scanner;

public class Area {
	int area;
	void area(int length, int breath)
	{
		area=length*breath;
		System.out.println("Area of rectangle is : "+area);
	}
	
	void area(int base, int height, float x)
	{
		area= (int) (x*base*height);
		System.out.println("Area of triangle is : "+area);
	}
	void area(int side) {
		area=side*side;
		System.out.println("Area of square is "+area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breath");
		int l=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Enter base , height ");
		int base=sc.nextInt();
		int height=sc.nextInt();
		
		System.out.println("Enter side of Square");
		int side=sc.nextInt();
		
		Area a1=new Area();
		a1.area(l, b);
		a1.area(base, height, 0.5f);
		a1.area(side);
	}

}
