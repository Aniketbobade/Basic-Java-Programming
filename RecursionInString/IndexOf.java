package RecursionInString;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Aniket";
		int index = 2;
		loop1(0,s,index);
		
	}

	private static void loop1(int i, String s, int index) {
		// TODO Auto-generated method stub
		if(i<s.length()) {
			if (index == i) {
				System.out.println(s.charAt(index));
			}
			i++;
			loop1(i, s, index);
			
		}
	}

}
