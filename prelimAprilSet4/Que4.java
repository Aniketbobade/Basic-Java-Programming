package prelimAprilSet4;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" abc  pqr  ";
		int start=0;
		int end=s1.length()-1;
		while(true) {
			if(s1.charAt(start)==' ') {
				start++;
			}else {
				break;
			}
		}
		while(true) {
			if(s1.charAt(end)==' ') {
				end--;
			}else {
				break;
			}
		}
		String s2="";
		for (int i = start; i <=end; i++) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		String s3="";
		int i=0;
		int j=i+1;
		while(i<s2.length()) {
			if (s2.charAt(i)!=' '||s2.charAt(j)!=' ') {
				s3=s3+s2.charAt(i);
			}
			i++;
			j++;
		}
		System.out.println(s3);
	}

}
