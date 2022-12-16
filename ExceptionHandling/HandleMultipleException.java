package ExceptionHandling;

import java.util.Scanner;

public class HandleMultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5 };
		int res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two num");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Enter the index to display element : ");
		int index = sc.nextInt();
		try {
			res = x / y;// 1st Exception (child )
			System.out.println("index "+a[index]); // 2nd Exception (child)
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("infinte ...");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("index out bounds...");
		}
		catch(Exception e) {
//			this is parent class in Exception handling and its rule to write after child class.
		}
		System.out.println("Div res " + res);
	}

}
