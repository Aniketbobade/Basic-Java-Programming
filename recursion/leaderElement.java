package recursion;

public class leaderElement {
	public static void main(String[] args) {
		int a[] = { 3, 8, 2, 5, 4 };
		loopI(0,a);
		
	}

	private static void loopI(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int count = 0;
			count=loopJ(i+1,i,a,count);
			

			if (count == 0) {
				System.out.println(a[i]);
			}
			i++;
			loopI(i, a);
		}
	}

	private static int loopJ(int j, int i, int[] a, int count) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			if (a[i] < a[j]) {
				count++;
				return count;
			}
		}
		return count;
	}
}