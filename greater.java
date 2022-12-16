package number;

import java.util.Scanner;

public class greater {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter First number: ");
	a=input.nextInt();
	System.out.println("Enter second number: ");
	b=input.nextInt();
	System.out.println("Enter Third number: ");
	c=input.nextInt();
	
	if(a>=b && a>=c)  
		System.out.println(a+" is the largest Number");  
		 
		else if (b>=a && b>=c)  
		System.out.println(b+" is the largest Number");  
		else  
		 
		System.out.println(c+" is the largest number");  
}
}
