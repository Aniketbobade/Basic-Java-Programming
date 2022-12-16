package strings;

import java.util.Scanner;

public class EqualDevided {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str=sc.next();
		System.out.println("Enter a number to convert equal part");
		int num=sc.nextInt();
		
		char ch[]=str.toCharArray();
		int len=ch.length;
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(ch[i]);	
			}
			System.out.println();
		}
		
		
	}

}
