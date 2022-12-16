package array;

public class RemoveDublicateValueAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 1, 2, 2, 1, 3, 1 };

		int count2 = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					count++;

				}
			}

			if (count == 0) {
				count2++;
			}
		}
		System.out.println(count2);
	}

}
