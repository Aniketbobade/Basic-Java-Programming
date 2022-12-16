package array;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,7,3,5,55,78};
		int max=0;
		int Secondmax=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if((a[i]>Secondmax)&&(a[i]!=max))
			{
				Secondmax=a[i];
			}
		}
		
		int firstMax=max;
		
		System.out.println(firstMax+" "+ Secondmax);
	}

}
