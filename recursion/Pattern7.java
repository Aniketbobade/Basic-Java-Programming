package recursion;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopI(0);
		
		
	}

	private static void loopI(int i) {
		// TODO Auto-generated method stub
		if(i<5) {
			loopJ(0,i);
			System.out.println();
			i++;
			loopI(i);
		}
	}

	private static void loopJ(int j, int i) {
		// TODO Auto-generated method stub
		if(j<5) {
			if(j-i>=0) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			j++;
			loopJ(j, i);
		}
	}

}
