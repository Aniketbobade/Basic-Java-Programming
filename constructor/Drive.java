package constructor;
class Vehicle{
	String vehicleColor;
	int gearCount,wheelCount;
	
	Vehicle()
	{
		vehicleColor=null;
		gearCount=0;
		wheelCount=0;
	System.out.println("Vehicle color: " +vehicleColor);
	System.out.println("Gear Count "+gearCount);
	System.out.println("Wheel Count "+wheelCount);
	}
	
	Vehicle(String vehicleColor, int gearCount, int wheelCount){
		this.vehicleColor=vehicleColor;
		this.gearCount=gearCount;
		this.wheelCount=wheelCount;
		
		System.out.println("Vehicle color: " +vehicleColor);
		System.out.println("Gear Count "+gearCount);
		System.out.println("Wheel Count "+wheelCount);
		
	}
	
}
public class Drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Vehicle("Black", 5, 4);
	}

}
