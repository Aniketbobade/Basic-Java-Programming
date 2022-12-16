package array;

public class SeedIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int m=2;
		int n=5;
		
		int mIndex=0;
		int nIndex=0;
	
		for(int i=0;i<a.length;i++) {
			if(a[i]==m) {
				mIndex=i;
				break;
			}
			
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				nIndex=i;
				break;
			}
			
		}
		
		System.out.println("Diffrence between is : "+(nIndex-mIndex));
	}

}

