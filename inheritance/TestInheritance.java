package inheritance;

public class TestInheritance extends Testing{
int num2=10;
	void display2()
	{
		super.display2();
	System.out.println("Good evening");	
	}
	void show1()
	{
		System.out.println(num1 +" "+num2+" "+super.num2); //super keyword used for inherite the value of parent class while same name instatenius variable are there
	}
}
