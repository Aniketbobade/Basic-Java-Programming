package practiceWork;

public class unequalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int r1 = 2, c1 = 3;
//        int r2 = 3, c2 = 2;
        int[][] a = { {3, -2, 5}, 
        			   {3, 0, 4} };
        int[][] b = { {2, 3}, 
        			  {-9, 0}, 
        			   {0, 4} };

        // Mutliplying Two matrices
        int[][] product = new int[a.length][b[0].length];
        for(int i = 0; i <a.length ; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	}

}
