package array;

public class arrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sum of all element present in array.
		int a[]= {1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("sum is "+sum);
}
}