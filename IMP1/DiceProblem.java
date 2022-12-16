package IMP1;

import java.util.Scanner;

public class DiceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you side");
		int num=sc.nextInt();
		System.out.println("Oppsite side is");
		switch(num) {
		case 1: System.out.println(6);
		break;
		case 2: System.out.println(5);
		break;
		case 3: System.out.println(4);
		break;
		case 4: System.out.println(3);
		break;
		
		case 5: System.out.println(2);
		break;
		case 6: System.out.println(1);
		break;
		}
	}

}
