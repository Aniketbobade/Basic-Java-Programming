package strings;

public class EqualityCheckBetweenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Hello";
String s2="Hello";

boolean flag=s1.equals(s2); // equal check method

System.out.println(flag);
String s3="HELLO";

System.out.println(s1.equals(s3));

String s4="HELLO";
System.out.println(s3.equals(s4));

System.out.println("for S1 - S4 "+s1.equalsIgnoreCase(s4));
	}

}
