package recursion;

public class NatrualNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 10;
		int x = loopI(1, num, sum);

		System.out.println(x);
	}

	private static int loopI(int i, int num, int sum) {
		// TODO Auto-generated method stub
		if (i <= num) {
			sum = sum + i;
			i++;

			sum = loopI(i, num, sum);

		}
		return sum;
	}

}
