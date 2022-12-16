package week2;

import java.util.Scanner;

public class fabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int firstNum=0;
		int secNum=1;
		int nextNum;
		System.out.print(firstNum+" "+secNum);
		
		for(int i=0;i<num;i++) {
			nextNum=firstNum+secNum;
			System.out.print(" "+nextNum);
			firstNum=secNum;
			secNum=nextNum;
			
		}
	}

}
