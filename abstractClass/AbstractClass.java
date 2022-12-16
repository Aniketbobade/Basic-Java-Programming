package abstractClass;
//In Abstract class we can not create object. 
//For define Methods we need to unname class after calling object in main method (this is similar to inheritance concept)
abstract class Employee{
	abstract void Show();
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee() {
			
			@Override
			void Show() {
				// TODO Auto-generated method stub
				System.out.println("Hello Program");
			}
		};
		e1.Show();
	}

	}


