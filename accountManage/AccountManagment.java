package accountManage;

import java.util.Scanner;

public class AccountManagment {
String name, accountNumber,contactNumber,id;
int dAmount,wAmount,totalBalance;

Scanner sc=new Scanner(System.in);

void insertData()
{
	System.out.println("Enter your details ");
	System.out.println("Enter your name : ");
	name=sc.next();
	System.out.println("Enter your account number");
	accountNumber=sc.next();
	System.out.println("Enter your contact number ");
	contactNumber=sc.next();
	System.out.println("Enter Adhaar number");
	id=sc.next();
	

	int choice;
	do
	{
		System.out.println("Enter a choice for following operation ");
		System.out.println("Enter 1 for deposite money in Account");
		System.out.println("Enter 2 for withdraw money from Account");
		System.out.println("Enter 3 for balance check");
		System.out.println("Enter 4 for Display");
		System.out.println("Enter 5 for exit");
		
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("Enter Amount to deposite in Account");
				dAmount=sc.nextInt();
				depositAmount(dAmount);
				break;
		case 2: System.out.println("Enter Amount to withdraw ");	
				wAmount=sc.nextInt();
				withdrawAmount(wAmount);
				break;
		case 3: checkBalance();
				break;
		case 4 :displaData();
				break;
		case 5: System.exit(0);
				break;
		default : System.out.println("Enter choice is invalid");
		}
	}
	while(choice<=5);
}

void displaData()
{
	System.out.println("** Customer Details **");
	System.out.println("name"+name);
	System.out.println("Account number: "+accountNumber);
	System.out.println("Contact number : "+contactNumber);
	System.out.println("Id : "+id);
	}

void depositAmount(int dAmount) {
 totalBalance=totalBalance+dAmount;
 checkBalance();
}
void withdrawAmount(int wAmount)
{
	totalBalance=totalBalance-wAmount;
checkBalance();	
}
void checkBalance()
{
	System.out.println("Total Bance is : "+totalBalance);
}
}

