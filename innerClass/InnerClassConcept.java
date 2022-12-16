package innerClass;
class outer{
int x=100;
void m1()
{
	System.out.println("*******");
}
	void show()// outer class Method1
	{
		class Number // Inner class
		{
			int num1,num2,result;
			void sum() // inner Method
			{
			result=num1+num2;
			System.out.println("Sun is : "+result);
			}
			void display()
			{
				m1();
				System.out.println(x);
			}
			
		}
		Number n1=new Number();
		n1.num1=55;
		n1.num2=34;
		n1.sum();
		n1.display();
		
	}
	
}
public class InnerClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer out=new outer();
		out.show();
	}

}
