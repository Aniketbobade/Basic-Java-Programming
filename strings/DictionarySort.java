package strings;

public class DictionarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="welcome wel";
		String s[]=s1.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(comapare(s[i],s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(String x:s)
			System.out.println(x);
	}

	private static int comapare(String s1, String s2) {
		// TODO Auto-generated method stub
		int i=0;
		int cnt=0;
		while(i<s1.length() && i<s2.length()) {
			if(s1.charAt(i)==s2.charAt(i)) {
				cnt++;
			}else {
				return s1.charAt(i)-s2.charAt(i);
			}
			i++;
		}
		if(s1.length()==cnt || cnt==s2.length()) {
			return s1.length()-s2.length();
		}
		return 0;
	}

}
