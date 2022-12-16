package RecursionInString;

public class RemoveAllspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  Aniket     Bobade   ";
//		Using Method	
			System.out.println(s.trim());
			
//			using implementation
			int start=0;
			int end=s.length()-1;
			
			while(true) {
				if(s.charAt(start)==' ') {
					start++;
				}else {
					break;
				}
			}
			
			while(true) {
				if(s.charAt(end)==' ') {
					end--;
				}else {
					break;
				}
			}
//			System.out.println(start +" "+end);
			String s2="";
			for (int i = start; i <=end; i++) {
				s2=s2+s.charAt(i);
			}
			System.out.println(s2);
int i=0;
int j=i+1;
String s3="";
while(j<=s2.length()) {
	if(s2.charAt(i)!=' '|| s2.charAt(j)!=' ') {
		s3=s3+s2.charAt(i);
	}
	i++;
	j++;
}
System.out.println(s3);
	}

}
