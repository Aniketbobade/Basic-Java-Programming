package ExceptionPractice;

import java.util.Scanner;

public class multipleHandling {

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
			res = x / y;
			System.out.println("index "+a[index]);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("infinte ...");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("index out bounds...");
		}
		catch(Exception e) {
		}
		System.out.println("Div res " + res);

	}

}
