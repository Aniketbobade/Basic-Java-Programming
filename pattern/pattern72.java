package pattern;

public class pattern72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				if(j+i>=4&&j-i<=4) {
					if(j<5) {
						System.out.print(i+j-3);
					}
					else {
						System.out.print(j+i-5);
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
