package OPPs;

public class DisplayMethod {
// Methods with no returnTypeand no Parameters
	void Display()
	{
		System.out.println("Hello Everyone");
	}
	void sum()
	{
		int num1,num2,result;
		num1=45;
		num2=34;
		result=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is " +result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMethod p1=new DisplayMethod();
		p1.Display();
		p1.sum();
	}

}
