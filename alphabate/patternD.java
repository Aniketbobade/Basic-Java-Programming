package alphabate;

public class patternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<7;i++) {
			for(int j=0;j<5;j++) {
				if((j==0)||(i==0 && j<=3)||(j==4 && i>=1 && i<=5)||(i==6&& j<=3)) {
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
