package prelimsetA4April;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]={'a','b','c','d'};
		char b[]={'w','x','y','z'};
		
		char c[]=new char[a.length+b.length];
		int index=0;
		for (int i = 0; i < a.length||i<b.length; i++) {
			if (i<a.length) {
				c[index++]=a[i];
				
			}
			if(i<b.length) {
				c[index++]=b[i];
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+", ");
		}
	}

}
