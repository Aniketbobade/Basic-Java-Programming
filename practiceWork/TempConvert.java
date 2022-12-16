package practiceWork;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Cel");
		int c=sc.nextInt();
		
		int fer=(9*c/5)+32;
		System.out.println("Fer value is"+fer);
	}

}
