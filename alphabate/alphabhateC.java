package alphabate;

public class alphabhateC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			for(int j=0;j<5;j++) {
				if((j==0 && i<5)||(i==0 && j>=1)||(i==5 && j<=1 )) {
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
