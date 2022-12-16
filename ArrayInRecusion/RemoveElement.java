package ArrayInRecusion;

public class RemoveElement {
	static int index = 0;
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int ele = 4;
		int cnt = 0;
		cnt=loop1(0,a,ele,cnt);
		
		int b[] = new int[a.length - cnt];
				b=loop2(0,ele,a,b);
		loop3(0,b);
		
	}

	private static void loop3(int i, int[] b) {
		// TODO Auto-generated method stub
		if(i<b.length) {
			System.out.print(b[i]);
			i++;
			loop3(i, b);
		}
	}

	private static int[] loop2(int i, int ele, int[] a, int[] b) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			if (a[i] != ele) {
				b[index++]=a[i];
			}
			i++;
			b=loop2(i, ele, a, b);
		}
		return b;
	}

	private static int loop1(int i, int[] a, int ele, int cnt) {
		// TODO Auto-generated method stub
	if(i<a.length) {
		if (a[i] == ele) {
			cnt++;
			}
		i++;
		cnt=loop1(i, a, ele, cnt);
	}
	return cnt;
	}

}
