package recursion;

public class ElementPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {33,7,90,20,5,50,40};
		int ele=7;
		int cnt=0;
		cnt=loopI(0,ele,cnt,a);
		if(cnt==0) {
			System.out.println("not found");
		}
	}

	private static int loopI(int i, int element, int cnt, int[] a) {
		// TODO Auto-generated method stub
	if(i<a.length) {
		if (a[i]==element) {
			System.out.println("found");
			cnt++;
			return cnt;
		}
		i++;
		cnt=loopI(i, element, cnt, a);
	}
	return cnt;
	}

}
