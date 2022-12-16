package recursion;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 5, 23, 8, 99 };

		int max = 0;
		max=loopI(0,a,max);
		

		System.out.println(max);
	}

	private static int loopI(int i, int[] a, int max) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			if (a[i] > max) {
				max = a[i];
				
			}
			i++;
			max=loopI(i, a, max);
			
		}
		return max;
	}
}
