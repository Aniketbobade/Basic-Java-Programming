package PrelimSetBApril;

import java.util.Iterator;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit");
		int unit = sc.nextInt();

		int row = unit;
		int cols = 2 * unit;
		int start = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				if (j - i >= 0 && j < (unit + 1)) {
					System.out.print((start++) + " ");
				} 
				
				else if(j + i <= (cols - 1) && j > (unit + 1)){
					System.out.print(start+" ");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();

		}
	}
}
