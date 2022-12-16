package recursion;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 4, 5, 6, 6 };
		int count = 0;
		count=loopI(0,a,count);
		
		int b[] = new int[a.length - count];
		int index = 0;
		index=loopPrintI(0,a,b,index);
		loopPrint(0,b);
		
	}
	private static void loopPrint(int i, int[] b) {
		// TODO Auto-generated method stub
		if(i<b.length) {
			System.out.println(b[i]);
			i++;
			loopPrint(i, b);
		}
	}
	private static int loopPrintI(int i, int[] a, int[] b, int index) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int cnt = 0;
			cnt=loopPrintJ(0,i,a,b,cnt,index);
			
			if (cnt == 0) {
				b[index++] = a[i];
			}
			i++;
			index=loopPrintI(i, a, b, index);
		}
		return index;
	}
	private static int loopPrintJ(int j, int i, int[] a, int[] b, int cnt, int index) {
		// TODO Auto-generated method stub
		if(j<i) {
			if (a[i] == a[j]) {
				cnt++;
				return cnt;
			}
			j++;
			cnt=loopPrintJ(j, i, a, b, cnt, index);
		}
		return cnt;
	}
	private static int loopI(int i, int[] a, int count) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			count=loopJ((i+1),i,a,count);
			
			i++;
			count=loopI(i, a, count);
		}
		return count;
	}
	private static int loopJ(int j, int i, int[] a, int count) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			if (a[i] == a[j]) {
				count++;
			}
			j++;
			count=loopJ(j, i, a, count);
		}
		return count;
	}

}
