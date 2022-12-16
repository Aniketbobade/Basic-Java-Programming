package recursion;

public class EqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };
		int count = 0;

		if (a.length == b.length) {
			count=loopI(0,a,b,count);
			
			if (count == a.length) {
				System.out.println("Equal");

			} else {
				System.out.println("Not Equal");
			}
		} else {
			System.out.println("Not Equal");
		}

	}

	private static int loopI(int i, int[] a, int[] b, int count) {
		// TODO Auto-generated method stub
		if(i<b.length) {
			if (a[i] == b[i]) {
				count++;

			}
			i++;
			count=loopI(i, a, b, count);
			
		}
		return count;
	}

}
