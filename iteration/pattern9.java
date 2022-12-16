package iteration;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<11;i++) {
			for(int j=0;j<6;j++) {
				if(j+i>=5&&j-i>=-5) {
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
