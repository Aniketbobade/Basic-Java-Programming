package problems;

import java.math.BigInteger;
import java.util.Scanner;

public class BIgInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BigInteger A=sc.nextBigInteger();
		BigInteger B=sc.nextBigInteger();
		
		BigInteger add=A.add(B);
		BigInteger multi=A.multiply(B);
		System.out.println(add);
		System.out.println(multi);
	}

}
