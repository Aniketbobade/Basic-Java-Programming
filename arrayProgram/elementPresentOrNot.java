package array;

public class elementPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int element=3;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(element==a[i]) {
				System.out.println(element+" is present");
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("Element not found");
		}
	}

}
