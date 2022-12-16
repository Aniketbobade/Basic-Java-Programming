package inheritance;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Child class Method calling
		TestInheritance t1=new TestInheritance();
		t1.display1();
		t1.display2(); //it show the child class methods (child class method having first preference only)
		t1.show1();
		//	this occur overriding. 
		
//		parent class Method Calling
//		Testing test=new Testing();
//		test.display1();
//		test.display2();
		
	
	}

}
