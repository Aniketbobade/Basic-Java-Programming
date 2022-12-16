package iteration;

public class charPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j+i>=4) {
					System.out.print((char)(65+(i+j)-4));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
