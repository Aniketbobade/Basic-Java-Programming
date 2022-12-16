package strings;

public class FindLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Aniket";
char ch[]=s1.toCharArray();

int cnt=0;

for (int i = 0; i < ch.length; i++) {
	cnt++;
}
System.out.println("Length of String "+cnt);
System.out.println(s1.length());
System.out.println(ch.length);
	}

}
