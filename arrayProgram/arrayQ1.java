package array;

public class arrayQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[5];
		array[0]=5;
		array[1]=8;
		array[2]=3;
		array[3]=4;
		array[4]=9;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		for(int i=0;i<5;i++) {
			System.out.println("Element of "+i+" is "+array[i]);
		}
	}

}
