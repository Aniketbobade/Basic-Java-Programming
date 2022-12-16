package start_work;

import java.util.Scanner;

public class avgMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int English,Math,Science,Hindi,SST;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of English");
		English=sc.nextInt();
		System.out.println("Enter the marks of Math");
		Math=sc.nextInt();
		System.out.println("Enter the marks of Science");
		Science=sc.nextInt();
		System.out.println("Enter the marks of Hindi");
		Hindi=sc.nextInt();
		System.out.println("Enter the marks of SST");
		SST=sc.nextInt();
		int Total=English+Math+Science+Hindi+SST;
		int Avg=Total/5;
		System.out.println("Average is "+Avg);
	}

}
