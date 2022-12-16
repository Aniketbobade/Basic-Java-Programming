package rectangle;

public class Rectangle {
int length,breath;
public Rectangle() {
length=6;
breath=5;
System.out.println(length*breath);
}

Rectangle(int length)
{
	this.length=length;
	System.out.println(length*breath);
}
Rectangle(int x, int y)
{
	length=x;
	breath=y;
	System.out.println(length*breath);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(2);
		Rectangle r3=new Rectangle(2,3);
		
	}

}
