package start_work;

public class Aniket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,2,7,4,8,2,5};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int x:a)
			System.out.println(x);
	}
}
