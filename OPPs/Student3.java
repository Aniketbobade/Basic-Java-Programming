package OPPs;

public class Student3 {
//Method with ReturnTtype and args (Paramter)
	int sum(int num1,int num2)
	{
		int sum;
		sum=num1+num2;
		System.out.println("Sum is "+sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student3 p1= new Student3();
		int x=p1.sum(25,45);
	}

}
