package ArrayInRecusion;

import java.util.Iterator;

public class RemoveDublicate {
static 	int index=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,3};
		int count=0;
		count=loop1(0,a,count);
	
		int b[]=new int[a.length-count];
	
		b=loop3(0,a,index,b);
		loop5(0,b);
		
	}

	private static void loop5(int i, int[] b) {
		// TODO Auto-generated method stub
		if (i<b.length) {
			System.out.print(b[i]);
			i++;
			loop5(i, b);
		}
	}

	private static int[] loop3(int i, int[] a, int index, int[] b) {
		// TODO Auto-generated method stub
		if (i<a.length) {
			int cnt=0;
			cnt=loop4(0,i,cnt,a);
			
			if (cnt==0) {
				b[index++]=a[i];
			}
			i++;
			b=loop3(i, a, index, b);
		}
		return b;
	}

	private static int loop4(int j, int i, int cnt, int[] a) {
		// TODO Auto-generated method stub
		if (j<i) {
			if (a[i]==a[j]) {
				cnt++;
			}
			j++;
			cnt=loop4(j, i, cnt, a);
			
		}
		return cnt;
	}

	private static int loop1(int i, int[] a, int count) {
		// TODO Auto-generated method stub
		if (i<a.length) {
			count=loop2((i+1),i,a,count);
			for (int j = i+1; j < a.length; j++) {
			
			}
			i++;
			count=loop1(i, a, count);
		}
		return count;
	}

	private static int loop2(int j, int i, int[] a, int count) {
		// TODO Auto-generated method stub
		if (j<a.length) {
			if (a[i]==a[j]) {
				count++;
			}
			j++;
			count=loop2(j, i, a, count);
		}
		return count;
	}

}
