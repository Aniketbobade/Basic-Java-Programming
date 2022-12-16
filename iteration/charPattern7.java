package iteration;

public class charPattern7 {
public static void main(String[] args) {
	for(int i=0;i<11;i++) {
		for(int j=0;j<6;j++) {
			if(j+i<=5||j-i<=-5) {
				System.out.print((char)(65+j));
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
