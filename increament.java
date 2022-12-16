package number;

import java.util.Scanner;

public class increament {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=input.nextInt();
	int sum=0;
	for(int i=1; i<=num;i++) {
		sum=sum+i;
		System.out.println("number is "+i+" result is "+sum);
	}
}
}
