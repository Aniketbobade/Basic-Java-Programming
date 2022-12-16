package ArrayInRecusion;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = { 1, 8, 2, 5, 6 };
		loop1(0,a);
		
		loop3(0,a);
		
		
	}

	private static void loop3(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			System.out.print(a[i]+" ");
			i++;
			loop3(i, a);
		}
	}

	private static void loop1(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int index=i;
			index=loop2(i+1,i,a,index);
			
			int temp=a[index];
			a[index++]=a[i];
			a[i]=temp;
			i++;
			loop1(i, a);
		}
	}

	private static int loop2(int j, int i, int[] a, int index) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			if(a[index]>a[j]) {
				index=j;
			}
			j++;
			return loop2(j, i, a, index);
		}
		return index;
	}
}
