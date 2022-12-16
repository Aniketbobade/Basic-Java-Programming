package strings;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String temp=s1;
		char ch[]=temp.toCharArray();
		int start=0;
		int end=s1.length()-1;
		while(start<end)
		{
			char temp2=ch[start];
			ch[start]=ch[end];
			ch[end]=temp2;
			start++;
			end--;
			
		}
		String s2=new String(ch);
		
		int cnt=0;
		for (int i = 0; i <s1.length(); i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
				cnt++;
			}
		}
		if(cnt==s2.length()) {
			System.out.println("Palindrom");
		}else {
			System.out.println("not Palindrom");
		}
	}

}
