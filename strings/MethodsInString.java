package strings;

public class MethodsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Java is a programming langauge";
System.out.println(s1.indexOf('m'));
	
	String s2=s1.toUpperCase();
	System.out.println(s2);
	String s3=s1.toLowerCase(); //set all char to to
	System.out.println(s2);
	
	String s="   Hello   ";
	System.out.println(s);
	String s4=s.trim(); //remove all spaces from start and end point
	System.out.println(s4);
	}

}
