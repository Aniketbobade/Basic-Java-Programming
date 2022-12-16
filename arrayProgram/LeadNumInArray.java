package array;

public class LeadNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 8, 2, 5, 4 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println(a[i]);
			}

		}

	}

}
