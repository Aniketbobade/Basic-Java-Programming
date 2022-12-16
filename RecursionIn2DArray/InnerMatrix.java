package RecursionIn2DArray;

public class InnerMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4, 5 }, { 5, 6, 2, 6, 2 }, { 3, 5, 6, 8, 9, }, { 4, 6, 3, 7, 2 }, { 2, 4, 7, 3, 8, } };
		int sum = 0;
		loop1(0,a);
		for (int i = 0; i < a.length; i++) {
			
		}
		//.out.println("Sum is " + sum);
	}

	private static void loop1(int i, int[][] a) {
		// TODO Auto-generated method stub
	if(i<a.length) {
		loop2(0,i,a);
		
		System.out.println();
		i++;
		loop1(i, a);
	}
	}

	private static void loop2(int j, int i, int[][] a) {
		// TODO Auto-generated method stub
		if(j<a[0].length) {
			if (i != 0 && i != a.length - 1 && j != 0 && j != a[0].length - 1) {
				System.out.print(a[i][j] + " ");

			} else {
				System.out.print(" ");
			}
			j++;
			loop2(j, i, a);
		}
	}

}
