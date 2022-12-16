package array;

public class BinarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 35, 36, 37, 38, 39 };
		int num = 3;
		int start = 0;
		int end = a.length - 1;
		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (a[mid] == num) {
				System.out.println("element found at " + mid);
				break;
			}
			else if (a[mid] < num) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		if(start>end) {
			System.out.println("not found");
		}		
	}
}
