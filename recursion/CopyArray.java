package recursion;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,6,7,8};
		int index=0;
		int[] b=new int[a.length];
		loopA(0,a,b);
		loopB(0,b);
			
	}

	private static void loopB(int i, int[] b) {
		// TODO Auto-generated method stub
		if(i<b.length) {
			System.out.println(b[i]);
			i++;
			loopB(i, b);
		}
	}

	private static void loopA(int i, int[] a, int[] b) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			b[i]=a[i];
			i++;
			loopA(i, a, b);
		}
	}

}
