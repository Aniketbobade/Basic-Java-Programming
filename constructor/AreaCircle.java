package constructor;

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCircle shape= new ShapeCircle(3.5f, 4.5f);
		float area=shape.area();
		System.out.println("Area is : "+area);
		float circumfarance=shape.circumfarance();
		System.out.println("Circumfarance is : "+circumfarance);
	}

}
