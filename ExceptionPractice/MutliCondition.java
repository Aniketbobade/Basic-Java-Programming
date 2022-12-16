package ExceptionPractice;

public class MutliCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12;
		int y=0;
		int res=0;
		int a[]= {1,2,3,4,5};
		try {
			res=x/y; 
			System.out.println(a[6]);
			System.out.println("in try block"); 
		}
		catch(ArithmeticException e){
			System.out.println("infinite");
		}
		System.out.println(res); 
	}

}
