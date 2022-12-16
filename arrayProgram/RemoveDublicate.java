package array;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {99,22,33,33,44,66,55,88,33,44,11};
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					cnt++;
					break;
				}
			}
		}
		int b[]=new int[a.length-cnt];
		int index=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for (int j = 0; j <i; j++) {
				if(a[i]==a[j])
				{
				count++;	
					
				}
			}
			if(count==0)
			{
				b[index++]=a[i];
				
			}
			
		}
		for (int i : b) {
			System.out.println(i);
		}
	}

}
