package copyConstructor;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Aniket", 11);
		e1.display();
		Employee e2=new Employee(e1);
		e2.display();
	}

}
