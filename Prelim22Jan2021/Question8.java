package Prelim22Jan2021;

class MyException extends Exception{
	public MyException(String s ) {
		super(s);
	}
}
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new MyException("Aniket");  
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("Bobade");
		}
	}

}
