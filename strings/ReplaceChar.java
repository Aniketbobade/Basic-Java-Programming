package strings;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Teddy";
String s2="";
for (int i = 0; i < s1.length(); i++) {
	if(s1.charAt(i)=='d') {
		s2=s2+'f';
	}
	else {
		s2=s2+s1.charAt(i);
	}
}
System.out.println(s2);
	}

}
