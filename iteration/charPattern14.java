package iteration;

public class charPattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				if(j+i>=4&&j<5) {
					System.out.print((char)(65+(i+j)-4));
				}
				else if(j>4&&j-i<=4) {
					System.out.print((char)(4-(j-i)+65));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
	}
}
