package prelimsetA4April;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j=j+2) {
				if (j+i>=4 && j<5) {
					System.out.print("*");
				}
				else if(j-i<=4 && j>=5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
