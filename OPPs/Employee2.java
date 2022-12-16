package OPPs;

public class Employee2 {
//Take value from main method and set a variable in under class 
//	Static variable
	int num1;
	

	void display()
	{
		System.out.println("num is "+num1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1=new Employee2();
		e1.num1=222;
		Employee2 e2=new Employee2();
		e1.display();
		e2.num1=111;
		
	}

}
