package iteration;

import java.util.Scanner;

public class powerFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter Exponent");
		int exp=sc.nextInt();
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=base*power;
		}
		System.out.println("base "+base+" to exponent "+exp+" "+" power is "+power);
		
	}

}
