package Main28Jan;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,5,7};
		int b[]= {2,3,5,6};
		int index=0;
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.println(b[j]);
				}
			}
		}
	}

}
