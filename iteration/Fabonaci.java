package iteration;

import java.util.Scanner;

public class Fabonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int firstTerm=0;
		int secTerm=1;
		System.out.print(firstTerm+" "+ secTerm);
		int nextTerm;
		for(int i=0; i<=num;i++) {
			nextTerm=firstTerm+secTerm;
			System.out.print(" "+nextTerm);
			firstTerm=secTerm;
			secTerm=nextTerm;
		}
	}

}
