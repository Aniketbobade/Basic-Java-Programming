package OPPs;

import java.util.Scanner;

public class AddSubMultiDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num1,num2,result;
		
		System.out.println("** WELCOME **");
		int choice=0;
		
		do {
			System.out.println("Plese select your Choise ...");
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Substraction");
			System.out.println("Enter 3 for multiplication");
			System.out.println("ENter 4 for Division");
			System.out.println("ENter 5 for exit");
				choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter first number");
					num1=sc.nextInt();
					System.out.println("Enter second number");
					num2=sc.nextInt();
					result=num1+num2;
					System.out.println("sum is "+result);
					break;
			
			case 2: System.out.println("Enter first number");
				num1=sc.nextInt();
				System.out.println("Enter second number");
				num2=sc.nextInt();
				result=num1-num2;
				System.out.println("substraction is "+result);
				break;
			case 3: System.out.println("Enter first number");
				num1=sc.nextInt();
				System.out.println("Enter second number");
				num2=sc.nextInt();
				result=num1*num2;
				System.out.println("multiplication is "+result);
				break;
			case 4: System.out.println("Enter first number");
				num1=sc.nextInt();
				System.out.println("Enter second number");
				num2=sc.nextInt();
				result=num1/num2;
				System.out.println("div is "+result);
				break;
			case 5: System.exit(0);	
				break;
			default : System.out.println("Invalid");	
			}		
		}
		while(choice<=5);
	}

}
