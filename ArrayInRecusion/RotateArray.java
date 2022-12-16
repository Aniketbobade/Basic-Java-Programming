package ArrayInRecusion;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 45, 5, 6, 8, 23, 6, 5 };

		int temp = a[0];
		a=loop1(0,a);
		

		a[a.length - 1] = temp;
		loop2(0,a);

	}

	private static void loop2(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			System.out.print(a[i]+" ");
			i++;
			loop2(i, a);
		}
	}

	private static int[] loop1(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length-1) {
			a[i] = a[i + 1];
			i++;
			a=loop1(i, a);
		}
		return a;
	}

}
