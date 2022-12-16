package strings;

public class TrimMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  Aniket Bobade   ";
//	Using Method	
		System.out.println(s.trim());
		
//		using implementation
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
//		System.out.println(start +" "+end);
		String s2="";
		for (int i = start; i <=end; i++) {
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	}

}
