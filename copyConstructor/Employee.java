package copyConstructor;

public class Employee {
String name;
int id;

	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	public Employee(Employee e1) {
	name=e1.name;
	id=e1.id;
	
	}
	
	void display()
	{
		System.out.println("name : "+name+" Id is :"+id);
	}
}
