package recursion;

public class PatternD28_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopI(0);
		
	}

	private static void loopI(int i) {
		// TODO Auto-generated method stub
		if(i<9) {
			loopJ(0,i);
			for (int j = 0; j < 5; j++) {
				
			}
			System.out.println();
			i++;
			loopI(i);
			
		}
	}

	private static void loopJ(int j, int i) {
		// TODO Auto-generated method stub
		if(j<5) {
			
		}
	}

}
