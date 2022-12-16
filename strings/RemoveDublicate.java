package strings;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="aabbccc";
String s2="";
for (int i = 0; i < s1.length(); i++) {
	int cnt=0;
	for (int j = 0; j < i; j++) {
		if(s1.charAt(i)==s1.charAt(j)) {
			cnt++;
		}
	}
	if(cnt==0) {
		s2=s2+s1.charAt(i);
	}
}
System.out.println(s2);
	}

}
