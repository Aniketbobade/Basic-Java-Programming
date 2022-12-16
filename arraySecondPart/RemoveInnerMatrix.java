package arraySecondPart;

public class RemoveInnerMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4, 5 },
					{ 5, 6, 2, 6, 2 }, 
					{ 3, 5, 6, 8, 9, }, 
					{ 4, 6, 3, 7, 2 }, 
					{ 2,4,7,3,8,4} };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == 0 || i == a.length - 1 || j == 0 || j == a[0].length-1) {
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			
		}
		System.out.println();
	}
	}
}
