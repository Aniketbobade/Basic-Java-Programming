package recursion;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopI(2);
	}

	private static void loopI(int i) {
		// TODO Auto-generated method stub
		if (i < 20) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
			loopI(i);
		}
	}

}
