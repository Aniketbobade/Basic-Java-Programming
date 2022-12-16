package Prelim22Jan2021;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String s1="abbccc";
	 String s2="";
		for (int i = 0; i < s1.length(); i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i)==s1.charAt(j) && count < 1) {
					count++;
				}
			}
			
			int cnt = 0;
			
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(i)==s1.charAt(j) || cnt >= 1) {
					s2=s2+s1.charAt(j);
					break;
				} else {
					cnt++;
				}
			}
		
		}
		System.out.println(s2);
	
	}

}
