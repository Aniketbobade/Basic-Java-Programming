package iteration;

import java.util.Scanner;

public class evenOddRange {

	public static void main(String[] args) {
		int startRange,endRange;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start number");
		startRange=sc.nextInt();
		System.out.println("Enter the End number");
		endRange=sc.nextInt();
		
		for(int i=startRange;i<endRange;i++) {
			if(i%2==0) {
				System.out.println(i+" is Even");
			}
		}
		for(int i=startRange;i<endRange;i++) {
			if(i%2!=0) {
				System.out.println(i+" +"+ "is odd");
			}
		}
	}

}
