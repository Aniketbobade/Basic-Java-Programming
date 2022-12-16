package strings;

public class doubleCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abc";
String s2="";
for (int i = 0; i < s1.length(); i++) {
	char ch=s1.charAt(i);
	s2=s2+ch+ch;
}
System.out.println(s2);
	}

}
