package start_work;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a salary");
		int salary=sc.nextInt();
		int grossSalary;
		if(salary<=10000) {
			grossSalary=(int) (salary+0.2*salary+0.8*salary);
			System.out.println(grossSalary);
		}
		else if(salary<=20000) {
			grossSalary=(int) (salary+0.25*salary+0.9*salary);
			System.out.println(grossSalary);
		}
		else if(salary>20000) {
			grossSalary=(int) (salary+0.3*salary+0.95*salary);
			System.out.println(grossSalary);
		}
	}

}
