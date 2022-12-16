package containment;

public class AddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad= new Address("Pune", "Mh", "India", 110);
		
	Person p=new Person(ad, "Aniket", "545865", "Hr", "Pune", 630);
		p.displayPersonDetails();
	}

}
