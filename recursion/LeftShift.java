package recursion;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {45,5,6,8,23,6,5};

		int temp=a[0];
		loopI(0,a);
		
		
		a[a.length-1]=temp;
		loopIprint(0,a);
		for (int j=0;j<a.length;j++) {
			
			
		}
	}

	private static void loopIprint(int j, int[] a) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			System.out.print(a[j] +" ");
			j++;
			loopIprint(j, a);
		}
	}

	private static void loopI(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length-1) {
			a[i]=a[i+1];
			i++;
			loopI(i, a);
			
		}
	}

}
