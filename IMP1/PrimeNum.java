package IMP1;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for (int i = 0; i < 100; i++) {
			//int cnt = 0;
			boolean prime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}

			}
			if (prime == true)
			{
				if (cnt % 2 == 0)
				{
					System.out.println(i);
				}
				cnt++;
			}

		}

	}
}
