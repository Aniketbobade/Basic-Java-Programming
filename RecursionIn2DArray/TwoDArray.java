package RecursionIn2DArray;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		loopI(0,a);
		for (int i = 0; i < a.length; i++) {
			
			
		}
	}

	private static void loopI(int i, int[][] a) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			loopJ(0,i,a);
			
			System.out.println();
			i++;
			loopI(i, a);
			
		}
	}

	private static void loopJ(int j, int i, int[][] a) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			System.out.print(a[i][j] + " ");
			j++;
			loopJ(j, i, a);
		}
	}

}
