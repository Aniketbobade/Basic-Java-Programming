package number;

import java.util.Scanner;

public class odd_even {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Your number: ");
	int num=input.nextInt();
	
	if(num%2==0) {
		System.out.println("Your number is even "+num);
		
		
	}
	else {
		System.out.println("Your nunber is odd "+num);
	}
			
}
}
