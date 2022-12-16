package recursion;

public class UniqueTriplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int num = 12;
		loopI(0,num,a);
		
	}

	private static void loopI(int i, int num, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			loopJ((i+1),i,num,a);
			
			i++;
			loopI(i, num, a);
			
		}
	}

	private static void loopJ(int j, int i, int num, int[] a) {
		// TODO Auto-generated method stub
		if(j<a.length){
			loopK((j+1),j,i,num,a);
			
			j++;
			loopJ(j, i, num, a);
		}
	}

	private static void loopK(int k, int j, int i, int num, int[] a) {
		// TODO Auto-generated method stub
		if(k<a.length) {
			if (a[i] + a[j] + a[k] < num) {
				System.out.println(a[i] + " " + a[j] + " " + a[k]);
			}
			k++;
			loopK(k, j, i, num, a);
		}
	}

}
