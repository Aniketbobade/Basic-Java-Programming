package strings;

public class SecondMostFrequentChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abbbccdb";
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			int count=0;
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i)==s1.charAt(j)) {
					count++;
				}
			}if(count==0) {
				s2=s2+s1.charAt(i);
			}
		}
		int max=0;
		int smax=-1;
		int index=0;
		int index2=0;
		for (int i = 0; i < s2.length(); i++) {
			int cnt=0;
			for (int j = 0; j < s1.length(); j++) {
				if (s2.charAt(i)==s1.charAt(j)) {
					cnt++;
				}
			}if(cnt>max) {
				max=cnt;
				index=i;
			}if(cnt>smax && max!=cnt) {
				smax=cnt;
				index2=i;
			}
		}
		if(smax==-1) {
			System.out.println("  "+smax);
		}
		else {
			System.out.println(s2.charAt(index2)+" "+smax);
		}
	}

}
