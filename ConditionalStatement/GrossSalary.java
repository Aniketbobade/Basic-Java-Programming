package ConditionalStatement;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary");
		float salary=sc.nextFloat();
		float TotalSalary=0;
		if(salary<=10000) {
			TotalSalary=(float) (salary+(0.2*salary)+(0.8*salary));
		}
		else if(salary<=20000) {
			TotalSalary=(float) (salary+(0.25*salary)+(0.9*salary));
		}
		else if(salary>20000) {
			TotalSalary=(float) (salary+(0.3*salary)+(0.95*salary));
		}
		
		System.out.println("Gross Salary "+TotalSalary);
	}

}
