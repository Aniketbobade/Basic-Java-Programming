package RecursionIn2DArray;

public class MaxNum {
static	int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		loop1(0,a);
		
		System.out.println(max);
	}

	private static void loop1(int i, int[][] a) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			loop2(0,i,a);
		
			i++;
			loop1(i, a);
		}
	}

	private static void loop2(int j, int i, int[][] a) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			if (a[i][j]>max) {
				max=a[i][j];
			}
			j++;
			loop2(j, i, a);
		}
	}

}
