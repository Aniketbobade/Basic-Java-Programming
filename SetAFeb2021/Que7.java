package SetAFeb2021;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="54321";
		char a[]=s1.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					char ch=a[i];
					a[i]=a[j];
					a[j]=ch;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
