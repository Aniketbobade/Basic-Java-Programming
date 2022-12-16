package recursion;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopI(0);

	}

	private static void loopI(int i) {
		// TODO Auto-generated method stub
		if (i < 4) {
			loopJ(0, i);
			System.out.println();
			i++;
			loopI(i);
		}
	}

	private static void loopJ(int j, int i) {
		// TODO Auto-generated method stub
		if (j < 7) {
			if (j + i >= 3 && j - i <= 3) {
				System.out.print("*");

			} else {
				System.out.print(" ");
			}
			j++;
			loopJ(j, i);
		}
	}

}
