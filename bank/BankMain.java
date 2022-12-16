package bank;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank(); //zero parameter Constructor
		Bank bank1=new Bank(2000); // Pass the value to Constructor
		bank1.display();
	}

}
