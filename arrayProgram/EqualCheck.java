package array;

public class EqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };
		int count = 0;

		if (a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				if (a[i] == b[i]) {
					count++;

				}
			}
			if (count == a.length) {
				System.out.println("Equal");

			} else {
				System.out.println("Not Equal");
			}
		} else {
			System.out.println("Not Equal");
		}
	}

}
