package RecursionInString;

public class MaxCharFreq {
static 	int max = 0;
static 	char ch = ' ';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabbddcssssddddd";
	loop1(0,s1);
		
		System.out.println(ch+ " "+max);

	}
	private static void loop1(int i, String s1) {
		// TODO Auto-generated method stub
		if(i<s1.length()) {
			int count = 0;
			count=loop2(0,i,s1,count);
			
			if (count == 0) {
				int cnt = 0;
				cnt=loop3(0,i,s1,cnt);
				
				if(cnt>max) {
					max=cnt;
					ch=s1.charAt(i);
				}
			}
			i++;
			loop1(i,s1);
		}
	}
	private static int loop3(int j, int i, String s1, int cnt) {
		// TODO Auto-generated method stub
		if(j<s1.length()) {
			if (s1.charAt(i) == s1.charAt(j)) {
				cnt++;
			}
			j++;
			cnt=loop3(j, i, s1, cnt);
		}
		return cnt;
	}
	private static int loop2(int j, int i, String s1, int count) {
		// TODO Auto-generated method stub
		if(j<i) {
			if (s1.charAt(i) == s1.charAt(j)) {
				count++;
			}
			j++;
			count=loop2(j, i, s1, count);
		}
		return count;
	}

}
