package arraySecondPart;

public class Multiple2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2},
		{2,3},
		{5,2}
};
int b[][]= {
		{1,3,4},
		{4,5,5},
		
};
int c[][]=new int[a.length][b[0].length];
for (int i = 0; i < c.length; i++) {
	for (int j = 0; j <b[0].length; j++) {
		for (int k = 0;  k< a[0].length; k++) {
			c[i][j]=c[i][j]+a[i][k]*b[k][j];
		}
	}
}
for (int i = 0; i < c.length; i++) {
	for (int j = 0; j < c[0].length; j++) {
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
	}

}
