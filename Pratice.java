package basic;

public class Pratice {
public static void main(String[] args) {
	String s1="Programming";
	String s2="miuhng";
	
	if(s2.length()<=s1.length()) {
		int s1end=s1.length()-1;
		int s2end=s2.length()-1;
		int i=0;
		int count=0;
		while(i<s2.length()) {
			if(s1.charAt(s1end)==s2.charAt(s2end)) {
				count++;
			}		
			i++;
			s1end--;
			s2end--;
		}if(count==s2.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}else {
		System.out.println(false);
	}
}
}