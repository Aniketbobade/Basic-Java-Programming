package recursion;

public class ReverseWithoutTemp {
static	int a[]= {1,2,3,4,5,6};
static 	int i=0;
static 	int j=a.length-1;
	public static void main(String[] args) {
		
		loopI(0,j,a);
		loopJ(0,a);
		
	}

	private static void loopJ(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			System.out.println(a[i]);
			i++;
			loopJ(i, a);
		}
	}

	private static void loopI(int i, int j, int[] a) {
		// TODO Auto-generated method stub
		if(i<j) {
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
			loopI(i, j, a);
		}
	}

}
