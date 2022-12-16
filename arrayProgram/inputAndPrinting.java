package array;

import java.util.Scanner;

public class inputAndPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter elements: ");
		for(int i=0;i<5;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.println("Element at "+i+" : "+array[i]);
		}
	}

}
