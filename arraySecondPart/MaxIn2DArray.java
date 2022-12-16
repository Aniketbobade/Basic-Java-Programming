package arraySecondPart;

public class MaxIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 7, 8 }, };
	int max=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if(a[i][j]>max) {
				max=a[i][j];
			}
		}
	}
		System.out.println("Maximum number is "+max);
	
		
	}

}
