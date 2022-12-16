package strings;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abcd";
String s2="abcd";
//System.out.println(s1.compareTo(s2));
int i=0;
int cnt=0;
while(i<s1.length()&& i<s2.length()) {
	if(s1.charAt(i)==s2.charAt(i)) {
		cnt++;
	}else {
		System.out.println(s1.charAt(i)-s2.charAt(i));
		break;
	}
	i++;
}
if(cnt==s1.length() || cnt==s2.length()) {
	System.out.println(s1.length()-s2.length());
}
	}

}
