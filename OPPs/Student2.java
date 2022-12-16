package OPPs;

public class Student2 {
// Method with returnType but with no args (Parameter)
	int sum()
	{
	int num1,num2,sum;
	num1=34;
	num2=45;
	sum=num1+num2;
	System.out.println("sum is"+sum);
	return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 p1=new Student2();
		int x=p1.sum();
	}

}
