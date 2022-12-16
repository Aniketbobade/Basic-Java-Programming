package deadLock;

public class Class2 {
public synchronized void c2m1(Class1 class2) {
	System.out.println("C2M2");
	try {
		Thread.sleep(10);
	} catch (Exception e) {
		// TODO: handle exception
	}
	class2.c1m2();
}
public synchronized void c2m2() {
	System.out.println("c2m2");
}
}
