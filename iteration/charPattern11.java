package iteration;

public class charPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<12;i++) {
			for(int j=0;j<6;j++) {
				if(j+i<=5) {
					System.out.print((char)(70-(i+j)));
				
				}
				else if(i>5&&j-i<=-6) {
					System.out.print((char)(59+(i-j)));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
