package HierachicallInheritance;

import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Manager m=new Manager();
		System.out.println("Manager name ");
		m.setName(sc.next());
		System.out.println("Enter age ");
		m.setAge(sc.nextInt());
		System.out.println("Enter address ");
		m.setAddress(sc.next());
		System.out.println("Enter Phone number ");
		m.setPhone(sc.next());
		System.out.println("Enter Salary ");
		m.setSalary(sc.nextFloat());
		System.out.println("Enter Department ");
		m.setDepartment(sc.next());
	
		System.out.println("Manager Name"+m.getName());
		System.out.println("Manager age"+m.getAge());
		System.out.println("Address"+m.getAddress());
		System.out.println("Phone number"+m.getPhone());
		System.out.println("Salary "+m.getSalary());
		System.out.println("Department"+m.getDepartment());
		Employee e=new Employee();
		e.setName("Prashant");
		e.setAge(24);
		e.setAddress("Pune");
		e.setPhone("756565465168");
		e.setSalary(785556);
		e.setWorkSpecialization("HR");
		System.out.println("Employee");
		System.out.println("Employee Name"+e.getName());
		System.out.println("Employee age"+e.getAge());
		System.out.println("Address"+e.getAddress());
		System.out.println("Phone number"+e.getPhone());
		System.out.println("Salary "+e.getSalary());
		System.out.println("Department"+e.getWorkSpecialization());
		
	}

}
