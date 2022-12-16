package constructor;

public class Rectangle1 {
	int length,breath;
	Rectangle1() //Zero args
	{
		length=5;
		breath=6;
		System.out.println(length*breath);
	}
	Rectangle1(int x) // 1 args and one is default 
	{
		length=x;
		System.out.println(length*breath);
		
	}
	Rectangle1(int x,int y)
	{
		length=x;
		breath=y;
		System.out.println(length*breath);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Rectangle1 r1=new Rectangle1();	
	Rectangle1 r2=new Rectangle1(2);	
	Rectangle1 r3=new Rectangle1(2,3);	
	}

}
