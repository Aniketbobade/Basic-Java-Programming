package number;

import java.util.Scanner;

public class Persentage_Calculator {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name=input.nextLine();
	
	int totle,obtain,percentage;
	System.out.println("Enter Totle English marks: ");
	int eng=input.nextInt();
	System.out.println("Enter obtain English marks: ");
	int eng1=input.nextInt();
	System.out.println("Enter Totle marathi marks: ");
	int mar=input.nextInt();
	System.out.println("Enter obtain marathi marks: ");
	int mar1=input.nextInt();
	System.out.println("Enter Totle Hindi marks: ");
	int hin=input.nextInt();
	System.out.println("Enter obtain Hindi marks: ");
	int hin1=input.nextInt();
	System.out.println("Enter Totle Science marks: ");
	int sci=input.nextInt();
	System.out.println("Enter obtain Science marks: ");
	int sci1=input.nextInt();
	System.out.println("Enter Totle Math marks: ");
	int math=input.nextInt();
	System.out.println("Enter obtain Math marks: ");
	int math1=input.nextInt();
	
	totle=eng+mar+hin+sci+math;
	obtain=eng1+mar1+hin1+sci1+math1;
	System.out.println("Totle mark is "+totle);
	System.out.println("obtain mark is "+ obtain);
	percentage=(obtain*100)/totle;
	System.out.println("Your percentage is "+percentage);
	
}
}
