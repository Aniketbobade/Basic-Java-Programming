package deadLock;

public class Class1 {
	public synchronized void c1m1(Class2 class2) {
		System.out.println("C1M1");
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		class2.c2m2();
		
	}
	public synchronized  void c1m2() {
		System.out.println("c1m2");
	}
}
