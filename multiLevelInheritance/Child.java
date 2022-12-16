package multiLevelInheritance;

public class Child extends Parent{
void m3()
{
	System.out.println("hi three");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		c1.m1();
		c1.m2();
		c1.m3();
	}

}
