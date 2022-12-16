package constructor;

public class Rectangle3 {
int length, breath;
public Rectangle3()
{
	length=0;
	breath=0;
}
Rectangle3(int x)
{
length=x;
breath=x;
}

Rectangle3(int length,int breadth)
{
	this.length=length;
	this.breath=breadth;
	
}
void area()
{
	System.out.println("********************");
	System.out.println("length : "+length+"breadth : "+breath);
	System.out.println(length*breath);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle3 r1=new Rectangle3();
		Rectangle3 r2=new Rectangle3(2);
		Rectangle3 r3=new Rectangle3(2,4);
		
		r1.area();
		r2.area();
		r3.area();
		
		
	}

}
