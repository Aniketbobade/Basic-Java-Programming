package Prelim22Jan2021;

import java.util.Iterator;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
