package arraySecondPart;

import java.util.Iterator;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {
		{9,8,7},
		{4,6,8},
		{7,1,5,}};

int b[][]=new int[a.length][a.length];

for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		b[j][i]=a[i][j];
	}
}
System.out.println("Matrix A is");
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
System.out.println("Matrix B");
for (int i = 0; i < b.length; i++) {
	for (int j = 0; j < b.length; j++) {
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}
	}

}
