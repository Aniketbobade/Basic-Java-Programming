package getterSetterInputWork;

import java.util.Scanner;

public class EmployeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee em1=new Employee();
		System.out.println("Enter Details ");
		System.out.println("Enter name");
		em1.setName(sc.next());
		System.out.println("Enter id");
		em1.setId(sc.nextInt());
		
		System.out.println("Displaying Details");
		System.out.println("Name is "+em1.getName());
		System.out.println("Id is "+em1.getId());
	}

}
