package recursion;

public class ElementRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int element=4;
		int cnt=0;
		int index=0;
		
		int b[]=new int[a.length-1];
		b=loopI(0,a,element,b,index);
		loopPi(0,b);
		
	}

	private static void loopPi(int i, int[] b) {
		// TODO Auto-generated method stub
		if(i<b.length) {
			System.out.println(b[i]);
			i++;
			loopPi(i, b);
			
		}
	}

	private static int[] loopI(int i, int[] a, int element, int[] b, int index) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			if(a[i]!=element) {
				b[index++]=a[i];
				
			}
			i++;
			b=loopI(i, a, element, b, index);
		}
		return b;
	}

}
