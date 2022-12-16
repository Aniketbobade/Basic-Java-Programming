package ExceptionHandling;

import java.util.Scanner;
//throws only send thise
public class Throws {
	void method1() throws ArrayIndexOutOfBoundsException{
	method2();
	System.out.println("exit 1");
	}
	void method2() throws ArrayIndexOutOfBoundsException {
		method3();
		System.out.println("exit 2");
	}
	void method3() throws ArrayIndexOutOfBoundsException {
	method4();
	System.out.println("exit 3");
}
	void method4() throws ArrayIndexOutOfBoundsException  {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5 };
		try {
		System.out.println(a[19]);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array out of index...");
		}
		System.out.println("Method exit 4");
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws obj = new Throws(); 
		obj.method1();
		System.out.println("exit main");
	}

}
