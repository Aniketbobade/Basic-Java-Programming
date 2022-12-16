package IMP1;

public class PalindromInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {111,222,11,111};
		int b[]=new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		int start=0;
		int end=b.length-1;
		while(start<end) {
			int temp=b[start];
			b[start]=b[end];
			b[end]=temp;
			start++;
			end--;
		}
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==b[i]) {
				cnt++;
			}
		}
		if(cnt==a.length) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
