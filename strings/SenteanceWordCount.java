package strings;

public class SenteanceWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="the value is big the size is null";
		String s[]=s1.split(" ");
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i].equals(s[j])) {
					//cnt++;
				}
			}
		}
	}

}
