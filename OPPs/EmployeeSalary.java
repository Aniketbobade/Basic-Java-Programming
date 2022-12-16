package OPPs;

public class EmployeeSalary {

	String name;
	float grossSalary,hra,da,basicSalary;
	
	public EmployeeSalary()
	{
		name=null;
		basicSalary=0.0f;
		hra=0.0f;
		da=0.0f;
				
	}
	
	EmployeeSalary(float hra,float da,float basicSalary, String name)
	{
		this.name=name;
		this.hra=hra;
		this.da=da;
		this.basicSalary=basicSalary;
	}
	float calculateSalary()
		{
			grossSalary=hra+da+basicSalary;
			return grossSalary;
		}
	void displayData()
	{
		System.out.println("name : "+name);
		System.out.println("Basic Salary: "+basicSalary+" hra: "+hra+" da : "+da);
		System.out.println("Gross Salary: "+grossSalary);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalary e1=new EmployeeSalary();
		EmployeeSalary e2=new EmployeeSalary(32,66,2000,"Aniket");
		e1.calculateSalary();
		e2.calculateSalary();
		
		e1.displayData();
		e2.displayData();
	}

}
