package array;

public class Maxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,23,8,99};
		
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println(max);
	}

}
