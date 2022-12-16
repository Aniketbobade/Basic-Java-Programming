package ExceptionHandling;

public class DifferrentTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12;//statment1
		int y=0; //statment2
		int res=0; //statment3
		System.out.println(x+" "+y+" "+res);//statment4
		try {
			System.out.println("in try block");//statment5
			res=x/y;
			System.out.println("try block end"); //statment6
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("int catch block"); //statment7
			System.out.println(45/0);
			System.out.println("infinite"); //statment8
		}
		System.out.println(res); //statment9
	}

}
