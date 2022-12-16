package array;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,8,3,7,9};
		
		int max=0;
		int min=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
			max=a[i];	
			}
			if(a[i]<min)
			{
				min=a[i];
				
			}
			
		}
		System.out.println(max+" "+min);
		System.out.println("Difference between min and max is "+(max-min));
	}

}
