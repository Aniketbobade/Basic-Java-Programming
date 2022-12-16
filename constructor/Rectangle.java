package constructor;

public class Rectangle {

	int length,breath;
	Rectangle()
	{
		length=5;
		breath=6;
	}
	
	void area()
	{
		System.out.println("Area of rectangle "+(length*breath));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		rect.area();
	}

}
