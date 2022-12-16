package iteration;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to print table");
		int num=sc.nextInt();
		
		for(int x=1;x<=10;x++) {
			System.out.println(num+" * "+x+" = "+(x*num));
			
		}
		
	}

}
