package strings;

public class EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Programming";
		String s2="ming";
		System.out.println(s1.endsWith(s2));
		if(s2.length()<=s1.length()) {
			int i=0;
			int cnt=0;
			int s1end=s1.length()-1;
			int s2end=s2.length()-1;
			
			while(i<s2.length()) {
				if(s1.charAt(s1end)==s2.charAt(s2end)) {
					cnt++;
				}
				i++;
				s1end--;
				s2end--;
			}
			if(cnt==s2.length()) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}

}
