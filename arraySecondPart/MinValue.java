package arraySecondPart;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 7, 8 }, };

		int min=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
			if(a[i][j]<min) {
				min=a[i][j];
			}
			}
		}
		System.out.println("Min value is "+min);
	}

}
