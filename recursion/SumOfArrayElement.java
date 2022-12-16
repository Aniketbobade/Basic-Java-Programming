package recursion;

public class SumOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		int x= loopI(0, sum, a);
		System.out.println(x);
	}

	private static int loopI(int i, int sum, int[] a) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			sum = sum + a[i];
			i++;
			sum = loopI(i, sum, a);
		}
		return sum;
	}
}
