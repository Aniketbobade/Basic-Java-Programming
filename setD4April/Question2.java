package setD4April;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6};
		int start=0;
		int end=a.length-1;
		
		while(start>end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		int sq1=a[1]*a[1];
		int sq2=a[a.length-2]*a[a.length-2];
		
		int diff=(sq1-sq2);
		System.out.println(diff);
		
	}

}
