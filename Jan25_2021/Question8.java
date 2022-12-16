package Jan25_2021;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aniket bobade";
		char ch='a';
		int cnt=0;
		int index=0;
		for (int i = s1.length()-1; i >=0; i--) {
			if (s1.charAt(i)==ch) {
				cnt++;
				
				break;
			}
			index++;
		}
		System.out.println(index);
	}

}
