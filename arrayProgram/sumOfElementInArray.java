package array;

public class sumOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("Sum is "+sum);
		int avg=sum/a.length;
		System.out.println("Average is "+avg);
	}
	
	

}
