package array;

public class evenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,5,7,4,5,3,64,};
		
		int evenCount=0; int oddCount=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				evenCount++;
				
			}
			else {
				oddCount++;
				
			}
		}
		System.out.println(evenCount+","+oddCount);
		int even[]=new int[evenCount];
		int odd[]=new int[oddCount];
		
		int evenIndex=0;
		int oddIndex=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			even[evenIndex]=a[i];
			evenIndex++;
			}
			else {
				odd[oddIndex]=a[i];
				oddIndex++;
			}
		}
		
		System.out.println("Array A is ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Array Even is");
		for(int y:even) {
			System.out.print(y+" ");
		}
		System.out.println();
		System.out.println("Array odd is ");
		for(int z:odd) {
			System.out.print(z+" ");
		}
	}
	

}
