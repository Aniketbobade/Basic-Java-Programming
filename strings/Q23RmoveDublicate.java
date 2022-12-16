package strings;

public class Q23RmoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aabbcc";
		String s="";
		
		for (int i = 0; i < s1.length(); i++) {
			int cnt=0;
			for (int j = 0; j < i; j++) {
				if(s1.charAt(i)==s1.charAt(j) && cnt>=1) {
					cnt++;
				}
			}
			if(cnt==0) {
				s=s+s1.charAt(i);
			}
			
			
		}
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < s1.length(); j++) {
				if(s.charAt(i)==s1.charAt(j)) {
					count++;  
				}
			}
			System.out.println(s.charAt(i)+" "+count);
		}
		
	}


}
