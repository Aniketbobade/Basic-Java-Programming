package constructor;

public class ShapeCircle {
float pi;
float redius;

ShapeCircle(float redius){
	this.redius=redius;
	
}
public ShapeCircle(float pi, float redius) {
	this(redius);
	this.pi=pi;

}
float area() {
	float area=pi*redius*redius;
	return area;
}
float circumfarance() {
	float circum=2*pi*redius;
	return circum;
}
}
