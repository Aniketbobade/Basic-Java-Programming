	package array;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,8,5,6,4,7,2};
		
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(int x:a) {
			System.out.println(x);
		}
	}

}
