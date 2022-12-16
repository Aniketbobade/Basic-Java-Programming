package pattern;

public class pattern79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if((j-i<=0&&j+i<=8)||(j+i<=9&&j-i<=1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
//		for(int i=0;i<10;i++) {
//			for(int j=5;j<10;j++) {
//				if(j+i<=9&&j-i<=1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//
//		}
	}
}
