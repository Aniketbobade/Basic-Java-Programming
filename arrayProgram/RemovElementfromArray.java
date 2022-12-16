package array;

public class RemovElementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int element=2;
		int index=0;
		int b[]=new int[a.length-1];
		
		for(int i=0;i<a.length;i++) {
			if(element!=a[i]) {
				b[index]=a[i];
				index++;
			}
		}
		for(int x:b) {
			System.out.println("Array element are "+x);
		}
	}
}
