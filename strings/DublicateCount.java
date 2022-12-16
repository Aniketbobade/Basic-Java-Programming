package strings;

public class DublicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabbcc";

		for (int i = 0; i < s1.length(); i++) {
			int cnt = 0;
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == 0)
			{
				int count=0;
				for (int j = 0; j < s1.length(); j++) {
					if(s1.charAt(i) == s1.charAt(j)) {
					count++;
					}
				}
				System.out.println(s1.charAt(i)+" "+count);
			}
			
		}
	}
}
