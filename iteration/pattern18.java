package iteration;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<7;i++) {
			for(int j=0;j<4;j++) {
				if(j-i>=0||j+i>=6) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
