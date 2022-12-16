package basic;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ani {
	public static void main(String[] args) {
		String s1="characters";
		String s2="alphabets";
		
		
		Set<Character> set=new TreeSet<Character>();
		String str1="";
		
		for (int i = 0; i < s1.length(); i++) {
			int cnt1=0;
			for (int j = 0; j < s2.length(); j++) {
				if(s1.charAt(i)!=s2.charAt(j)) {
					cnt1++;
				}
			}
			if(cnt1>0) {
				str1=str1+s1.charAt(i);
			}
		}
		System.out.println(str1);
		String str2="";
		int cnt2=0;
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if(s2.charAt(i)!=s1.charAt(j)) {
					cnt2++;
				}
			}
			if(cnt2>0) {
				str2=str2+s2.charAt(i);
			}
		}
		
		System.out.println(str2);
		
	}

}
