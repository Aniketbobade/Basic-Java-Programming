package triangle;

public class Area {
int area;
void area(int base, int height)
{
	area= (int) (0.5f*base*height);
	System.out.println("Area of triangle is : "+area);
}
void perimeter(int side1,int side2, int side3)
{
	int perimeter=side1+side2+side3;
	System.out.println("perimeter of triangle is "+perimeter);
}
void equiArea(int side1)
{
	int eArea=(int) ((Math.sqrt(3)/4)*side1*side1);
	System.out.println("Area of equilatral triangle is "+eArea);
}
void isosArea(int side1,int side2)
{
	int iArea= (int) (0.5f*side1*side2);
	System.out.println("Area of Isoscalus triangle "+iArea);
}
void rightArea(int side1, int side2)
{
	int rArea=(side1*side2)/2;
	System.out.println("Area of rightAngle Triangle "+rArea);
}

public static void main(String[] args) {
	Area t1=new Area();
	t1.area(5, 4);
	t1.perimeter(5, 6, 7);
	t1.equiArea(6);
	t1.isosArea(3, 6);
	t1.rightArea(5, 6);
}
}
