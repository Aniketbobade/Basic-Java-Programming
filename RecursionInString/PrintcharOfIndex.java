package RecursionInString;

public class PrintcharOfIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Aniket";
		
		char ch[]=s.toCharArray();
		loop1(0,ch);
		for (int i = 0; i < ch.length; i++) {
			
		}
	}

	private static void loop1(int i, char[] ch) {
		if(i<ch.length) {
			System.out.println(i+" "+ch[i]);
			i++;
			loop1(i, ch);
		}
		
	}

}
