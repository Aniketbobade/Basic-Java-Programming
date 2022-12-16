package array;

import java.util.Scanner;

public class numTypeFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A element ");
		int a[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int posCount = 0;
		int negCount = 0;
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenCount++;
			}
			if (a[i] % 2 != 0) {
				oddCount++;
			}
			if (a[i] > 0) {
				posCount++;

			}
			if (a[i] < 0) {
				negCount++;
			}

		}

		System.out.println("Positive count is " + posCount);
		System.out.println("Negative Count is " + negCount);
		System.out.println("Even Count is " + evenCount);
		System.out.println("Odd count is " + oddCount);
	}

}
