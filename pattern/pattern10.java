package pattern;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if((j+i>=3)&&(j-i<=-1)) {
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
