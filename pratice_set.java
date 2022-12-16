package basic;
class worker{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class cellPhone{
	static void ring() {
		System.out.println("Ringing phone");
	}
	static void call() {
		System.out.println("Calling phone");
	}
	static void slient() {
		System.out.println("slient phone");
	}
}

	class Square{
		int side;
		public int area() {
			return side*side;
		}
		public int perimeter(){
			return 4*side;
		}
	}
public class pratice_set {
public static void main(String[] args) {
/*
	//problem1
	worker Aniket=new worker();
	Aniket.setName("Aniket Bobade");
	Aniket.salary=3;
	System.out.println(Aniket.getSalary());
	System.out.println(Aniket.getName());
	
	//problem 2
	cellPhone redmi= new cellPhone();
	redmi.ring();
	redmi.call();
	redmi.slient();
	*/
	
	//problem 3
	Square sq= new Square();
	sq.side=5;
	System.out.println("Area of Square is "+sq.area());
	System.out.println("Perimter of Square is "+sq.perimeter());
	}
}
