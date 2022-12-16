package arraySecondPart;

public class SplitArray38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 1, 3, 6, 8, 2, 9, 0, 10 };

		int inc[] = new int[a.length];
		int dec[] = new int[a.length];
		int incElement = 0;
		int decElement = 0;

		if (a[0] > a[1]) {
			dec[0] = a[0];
			inc[0] = a[1];
			incElement = a[1];
			decElement = a[0];

		} else {
			dec[0] = a[1];
			inc[0] = a[0];

			incElement = a[0];
			decElement = a[1];
		}
			int incIndex = 1;
			int decIndex = 1;
		
			for (int i = 2; i < a.length; i++) {
				if (a[i] > incElement) {
					inc[incIndex++] = a[i];
					incElement = a[i];

				} else if (a[i] < decElement) {
					dec[decIndex++] = a[i];
					decElement = a[i];
				} else {
					System.out.println(-1);
					System.exit(0);
				}
			}
			for (int i = 0; i < incIndex; i++) {
				System.out.print(inc[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < decIndex; i++) {
				System.out.print(dec[i] + " ");
			}
		}
	}


