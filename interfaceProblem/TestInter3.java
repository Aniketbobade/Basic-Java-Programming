package interfaceProblem;

public class TestInter3 implements Inter3 {
	@Override
	public void show() {
		// TODO Auto-generated method stub
	System.out.println("hii...");	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("From Display");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInter3 test=new TestInter3();
		test.show();
		test.display();
	}

	

}
