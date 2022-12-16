package basic;
class base{
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("I am setting X value");
		this.x = x;
	}
public void printMe() {
	System.out.println("I am aconstructor");
}
class Derived extends base{
	public int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
}
public class Inheritance {
public static void main(String[] args) {
	base b = new base();
    b.setX(4);
    System.out.println(b.getX());
    
	}
}

