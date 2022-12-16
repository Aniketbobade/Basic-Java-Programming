package evenOddCheck;

public class Test {
int number, numFact,fact;

Test(int number)
{
	this.number=number;
	
}
Test(int fact, int numFact)
{
this.fact=fact;
this.numFact=numFact;
}

void evenOdd()
{
	if(number%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
}
void factorial()
{
	do {
		fact=fact*numFact;
		numFact--;
	}while(numFact>0);
	System.out.println("factorial is "+fact);
}
void additionOfAllDigit()
{
	int rem, sum=0;
	int n=number;
	
	while(number>0) {
		rem=number%10;
		sum=sum+rem;
		number=number/10;
		
	}
	System.out.println("Sum of All digit is "+sum);
}
}
