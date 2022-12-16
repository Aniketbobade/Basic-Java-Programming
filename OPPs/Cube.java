package OPPs;

public class Cube {
void cubeVol(int side)
{
	int volOfCube=side*side*side;
	System.out.println("volume of cube is "+volOfCube);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube= new Cube();
		cube.cubeVol(5);
	}

}
