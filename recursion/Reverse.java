package recursion;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,8,5,6,4,7,2};
		
		int i=0;
		int j=a.length-1;
		a=loopI(i,j,a);
		loopPrint(0,a);
		
	}

	private static void loopPrint(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			System.out.println(a[i]);
			i++;
			loopPrint(i, a);
		}
	}

	private static int[] loopI(int i, int j, int[] a) {
		// TODO Auto-generated method stub
		if(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			a=loopI(i, j, a);
		}
		return a;
	}

}
