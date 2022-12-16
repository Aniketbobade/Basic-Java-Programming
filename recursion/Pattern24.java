package recursion;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopI(0);
		for (int i = 0; i < 9; i++) {

		}
	}

	private static void loopI(int i) {
		// TODO Auto-generated method stub
		if (i < 9) {
			loopJ(0, i);
			for (int j = 0; j < 9; j++) {

			}
			System.out.println();
			i++;
			loopI(i);

		}
	}

	private static void loopJ(int j, int i) {
		// TODO Auto-generated method stub
		if (j < 9) {
			if ((j + i >= 4 && j - i >= -4) && (j + i <= 8 || j - i <= 0)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			j++;

			loopJ(j, i);

		}
	}

}
