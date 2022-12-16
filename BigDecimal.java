package problems;

import java.util.Arrays;
import java.util.Scanner;

public class BigDecimal {

	public BigDecimal(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of value");
		int size=sc.nextInt();
		String a[]=new String[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.next();
		}
		int index=0;
		BigDecimal b[]=new BigDecimal[size];
		for (int i = 0; i < b.length; i++) {
			b[i]=new BigDecimal(a[index++]);
		}
		Arrays.sort(b);
		for (BigDecimal bigDecimal : b) {
			System.out.println(bigDecimal);
		}
	}

}
