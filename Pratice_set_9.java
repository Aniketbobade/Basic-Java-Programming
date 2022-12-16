package basic;
class Cylinder{
	private int radius;
	private int height;
	public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
    	return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double Volume(){
    	return Math.PI*radius * radius *height;
    }
}
public class Pratice_set_9 {
public static void main(String[] args) {
	
	//Problem 1
	Cylinder newCylinder =new Cylinder(0,0);
	newCylinder.setHeight(12);
	int h=newCylinder.getHeight();
	System.out.println(h);
	newCylinder.setRadius(5);
	System.out.println(newCylinder.getRadius());
	
	
	//Problem 2
	System.out.println(newCylinder.surfaceArea());
	System.out.println(newCylinder.Volume());
	
	
	}
}
