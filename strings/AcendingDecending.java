package strings;

public class AcendingDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello hii Hammer ney";
		String sa[]=s.split(" ");
		//Ascending
		for (int i = 0; i < sa.length; i++) {
			for (int j = 0; j < sa.length; j++) {
				if(sa[i].length()<sa[j].length()) {
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
			}
		//Descending Order
		System.out.println("****************************");
		for (int i = 0; i < sa.length; i++) {
			for (int j = 0; j < sa.length; j++) {
				if(sa[i].length()>sa[j].length()) {
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);

	}

	}}
