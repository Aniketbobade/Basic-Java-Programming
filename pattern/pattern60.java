package pattern;

public class pattern60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				if(j-i>=0||j+i>=8) {
					if(i<5) {
						System.out.print(1+j-i);
					}
					else {
						System.out.print(i+j-7);
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
