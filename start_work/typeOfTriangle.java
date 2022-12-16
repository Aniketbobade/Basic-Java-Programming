package start_work;

import java.util.Scanner;

public class typeOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter three side of triangle");
		
		int a,b,c;
		System.out.println("Enter first");
		a=sc.nextInt();
		System.out.println("Enter second");
		b=sc.nextInt();
		System.out.println("Enter third");
		c=sc.nextInt();
		
		if((a==b)&&(a==c)) {
			System.out.println("Eqilatral Triangle");
		}
		else if((a==b)||(b==c)||(c==a) ){
			System.out.println("Isoscaleus Triangle");
		}
		else {
			System.out.println("Scalence");
		}
		
		
	}

}
