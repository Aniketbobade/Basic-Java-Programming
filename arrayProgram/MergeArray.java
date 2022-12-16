package array;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		
		int c[]=new int[a.length+b.length];
		
		int Index=0;
		
		for(int i=0; i<a.length;i++) {
			c[Index++]=a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			c[Index++]=b[i];
		}
		
		for(int i:c) {
			System.out.print(" "+i);
		}
	}

}
