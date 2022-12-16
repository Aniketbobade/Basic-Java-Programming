package strings;

public class IndexCharFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Programming";
int index=6;
for (int i = 0; i < s1.length(); i++) {
	if(index==i) {
		System.out.println(s1.charAt(i));
	}
}
//Using Method
//System.out.println(s1.charAt(1));

	}

}
