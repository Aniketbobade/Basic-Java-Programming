package bank;

public class Bank {
int amount=1000;
Bank()
{
	System.out.println("No Amount will be added");
	
}
Bank(int amount) //Receive value from object
{
	this.amount=this.amount+amount; //take value from instance variable and add to object value 
}

void display()
{
	System.out.println("Final Amount is "+amount);
}

}
