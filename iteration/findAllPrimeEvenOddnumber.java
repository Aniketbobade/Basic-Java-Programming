package iteration;

import java.util.Scanner;

public class findAllPrimeEvenOddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int option ;
		do {
			 
			System.out.println("for Even number press 1");
			System.out.println("For odd number press 2");
			System.out.println("For prime number press 3");
			System.out.println("For exit press 4");
			option=sc.nextInt();
		switch(option)
		{
		case 1: for(int i=1;i<100;i++) {
				if(i%2==0) {
					System.out.println(i+" is Even");
					}
				}
		break;
		case 2: for(int i=1;i<100;i++) {
				if(i%2!=0) {
				System.out.println(i+" is odd");
				}
			}
		break;
		case 3:for(int num=1;num<100;num++) {
				boolean prime=true;
			
				for(int i=2;i<num;i++) {
					if(num%i==0) {
					prime=false;
					break;
				}
				
			}
			
			 if(prime==true) {
				System.out.println(num+" Prime");
			}
				}
		case 4: System.exit(0);
		}
		}while(option<=4);

}
}
