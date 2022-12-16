package recursion;

public class IndexOfInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int element=3;
		int cnt=0;
		int x=loopI(0,cnt,element,a);
		
		if(x==0) {
			System.out.println("not present");
		}
	}

	private static int  loopI(int i, int cnt, int element, int[] a) {
		// TODO Auto-generated method stub
		if (i<a.length) {
			if (a[i]==element) {
				System.out.println("element present at index "+i);
				cnt++;
				return cnt;
			}
			i++;
			cnt=loopI(i, cnt, element, a);
			
		}
		return cnt;
	}

}
