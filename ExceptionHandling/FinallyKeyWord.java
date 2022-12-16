package ExceptionHandling;
import java.util.Scanner;

public class FinallyKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the index to display element : ");
		int index = sc.nextInt();
		try {
			System.out.println("Element at index: " + a[index]);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("please give index between 0-8");
		} finally {
			System.out.println("getting closed");
		}

	}

}
