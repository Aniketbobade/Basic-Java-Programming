package SetC4April;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int b[]= {5,6,7,8,9};
		int index=0;
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					c[index++]=a[i];
				}
			}
		}
		for (int i = 0; i < index; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
