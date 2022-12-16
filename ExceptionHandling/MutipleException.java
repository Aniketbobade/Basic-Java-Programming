package ExceptionHandling;

public class MutipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12;//statement 1
		int y=0; //statement 2
		int res=0; //statement 3
		int a[]= {1,2,3,4,5};
		try {
			res=x/y; //statement 4
			System.out.println(a[6]); //statement 5
			System.out.println("in try block"); //statement 6
		}
		catch(ArithmeticException e){
			System.out.println("infinite"); //statement 7
		}
		System.out.println(res);  //statement 8
 	}

}
