package RecursionInString;

public class DublicateCount {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabbcc";
		loop1(0,s1);
		

	}

	private static void loop1(int i, String s1) {
		// TODO Auto-generated method stub
		if (i<s1.length()) {
			int cnt=0;
			cnt=loop2(i+1,i,s1,cnt);
			
			if (cnt == 0)
			{
				 int count=0;
				count=loop3(0,i,s1,count);
				
				System.out.println(s1.charAt(i)+" "+count);
			}
			i++;
			loop1(i, s1);
		}
	}

	private static int loop3(int j, int i, String s1, int count) {
		// TODO Auto-generated method stub
		if(j<s1.length()) {
			if(s1.charAt(i) == s1.charAt(j)) {
				count++;
				}
			j++;
			count=loop3(j, i, s1, count);
		}
		return count;
	}

	private static int loop2(int j,int i, String s1, int cnt ) {
		// TODO Auto-generated method stub
		if (j<s1.length()) {
			if (s1.charAt(i) == s1.charAt(j)) {
				cnt++;
			}
			j++;
			cnt=loop2(j,i, s1, cnt);
		}
		return cnt;
	}

}
