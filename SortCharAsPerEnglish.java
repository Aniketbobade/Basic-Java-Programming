package programs;

public class SortCharAsPerEnglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove space then sort then exchange the a as z and so on in program
		String s1="a dead fox found";
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!=' ') {
				s2=s2+s1.charAt(i);
			}
		}
		//System.out.println(s2);
		String s3="";
		for (int i = 0; i < s2.length(); i++) {
			s3=s3+(char)(219-s2.charAt(i));
		}
		//System.out.println(s3);
		
		char[] ch1=s3.toCharArray();
		
		for (int i = 0; i <ch1.length; i++) {
			for (int j = i+1; j < ch1.length; j++) {
				if(ch1[i]<ch1[j]) {
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
							
				}
			}
		}
		String res=new String(ch1);
		System.out.println(res);
	}

}
