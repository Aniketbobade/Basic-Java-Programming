package inheritance;

public class ChildClass extends ParentClass { // child class inherits all properties of parent class

	void display()
	{
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass p1= new ParentClass();
		p1.add();
		p1.show();
		ChildClass c1= new ChildClass();
		c1.display();
		c1.show();
		c1.add();
	}

}
