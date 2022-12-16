package start_work;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with temp veritable
		int x=10;
		int y=20;
		System.out.println("value of X is "+x);
		System.out.println("value of Y is "+y);
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping ");
		System.out.println("Value of X is "+x);
		System.out.println("value od Y is "+y);
		
		//without temp variable 
		int  a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	
	}

}
