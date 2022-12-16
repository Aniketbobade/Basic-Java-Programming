package innerClass;

public class Test {
	int x=89;
	class A
	{
		int num1,num2,result;
		void show()
		{
			System.out.println("Hello");
			System.out.println(x);
		}
		void sum()
		{
			num1 =33;
			num2=55;
		result =num1+num2;
		System.out.println(result);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test= new Test();
		Test.A ob=test.new A();
//outerClass.InnnerClass InnerObject=outerObject.new Inner();
		ob.show();
		ob.sum();
	}

}
