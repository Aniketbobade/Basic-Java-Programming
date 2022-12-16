package strings;

public class StringtoCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Aniket";
char ch[]=new char[6];
	ch =s1.toCharArray(); //method
	for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]);
	}
	System.out.println(s1.length()); //to find length (Method)
	}

}
