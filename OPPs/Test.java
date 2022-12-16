package OPPs;

public class Test {
void sum(int num1,int num2)
{
int result=num1+num2;
System.out.println("Sum of two number is : "+result);
}
void sum(int num1,int num2,int num3)
{
	this.sum(num1, num2);
	int result=num1+num2+num3;
	System.out.println("sum of 3 number is "+result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1= new Test();
		t1.sum(4, 8, 8);
	}

}
