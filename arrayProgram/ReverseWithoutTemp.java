package array;

public class ReverseWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
		}
		for(int x:a) {
			System.out.println(x);
		}
	}

}
