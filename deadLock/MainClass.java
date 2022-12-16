package deadLock;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 c1=new Class1();
		Class2 c2=new Class2();
		Thread1 t1=new Thread1(c1, c2);
		t1.start();
		Thread2 t2=new Thread2(c1, c2);
		t2.start();
	}

}
