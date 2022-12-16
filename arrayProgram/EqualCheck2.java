package array;

public class EqualCheck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		int count=0;
		for (int i = 0; i < b.length; i++) {
			if((a.length==b.length)&&(a[i]==b[i])) {
				count++;
				
			}
		}
		if(count==0) {
			System.out.println("Not Equal");
		}
		else {
			System.out.println("Equal");
		}
	}

}
