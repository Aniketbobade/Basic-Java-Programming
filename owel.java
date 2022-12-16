package number;

import java.util.Scanner;

public class owel {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your charator ");
	char ch=input.next().charAt(0);
	if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')) {
	System.out.println("It is vowel char : "+ch);
	
}
	else {
		System.out.println("It is consonant : "+ch);
	}
}
}
