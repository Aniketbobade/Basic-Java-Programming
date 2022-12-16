package OPPs;

import java.util.Scanner;
public class Salary {
	Scanner sc=new Scanner(System.in);
	String name;
	int id;
	int yearOfExeperience;
	float basicSalaray;
	float salary;
	
	void input()
	{
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter ID");
		id=sc.nextInt();
		System.out.println("Year of Exeperience");
		yearOfExeperience=sc.nextInt();
		System.out.println("Basic Salary");
		basicSalaray=sc.nextFloat();
		
	}
	
	void calculateSalary() {
	if(yearOfExeperience >=5) {
		salary=basicSalaray+(basicSalaray*0.35f);
		
		}
	else {
		salary=basicSalaray+(basicSalaray*0.15f);
	}
	}
	
	void Display(){
	System.out.println("name "+name);
	System.out.println("ID "+id);
	System.out.println("year of Exeperience "+yearOfExeperience);
	System.out.println("total Salary "+salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary e1=new Salary();
		
		e1.input();
		e1.calculateSalary();
		e1.Display();
				
	}

}
