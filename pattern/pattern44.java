package pattern;

public class pattern44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j+i>=4) {
					System.out.print((j+1+" "));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
