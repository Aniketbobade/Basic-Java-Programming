package arraySecondPart;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter the size of array");
System.out.println("Enter rows");
int rows=sc.nextInt();
System.out.println("Enter Cols");
int cols=sc.nextInt();

int a[][]=new int[rows][cols];
System.out.println("Enter element of MAtrix");
//input
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		a[i][j]=sc.nextInt();
		
	}
	
}
//Display
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		System.out.print(a[i][j]+" ");
		
	}
	System.out.println();
	
}
	}

}
