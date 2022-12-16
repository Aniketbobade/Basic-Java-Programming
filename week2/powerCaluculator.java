package week2;

import java.util.Scanner;

public class powerCaluculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(i+" * "+num+" = "+(i*num));
			i++;
		}
	}

}
