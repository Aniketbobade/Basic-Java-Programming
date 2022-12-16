package week2;

import java.util.Scanner;

public class quetions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
//		int num=sc.nextInt();
//		int firstStep,secondStep,nextStep;
//		firstStep=0;
//		secondStep=1;
//		System.out.print(firstStep+" "+ secondStep+" ");
//		for(int i=0;i<num;i++) {
//			nextStep=firstStep+secondStep;
//			System.out.print(nextStep+" ");
//			firstStep=secondStep;
//			secondStep=nextStep;
//		}
		
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<5;j++) {
//				if(j+i<=4||j-i<=-4) {
//					if(i<5)
//						System.out.print(j+1+i);
//					else
//						System.out.print(10-i+j-1);
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		/*
		 * int countPink = 0,countYellow = 0,CountPinkAndYellow = 0; for(int
		 * i=33;i<=999;i++) { if(i%3==0 && i%5==0) {
		 * System.out.println("Pink and Yellow"); CountPinkAndYellow++; } else
		 * if(i%3==0) { System.out.println("Pink"); countPink++;
		 * 
		 * } else if(i%5==0) { System.out.println("Yellow"); countYellow++; } else {
		 * System.out.println(i); }
		 * 
		 * 
		 * } System.out.println("Pink Count is "+countPink);
		 * System.out.println("Yellow Count is "+countYellow);
		 * System.out.println("Pink and Yellow Count is "+CountPinkAndYellow);
		 */	
		
//		int num=sc.nextInt();
//		boolean prime=true;
//		for(int i=2;i<num;i++) {
//			if(num%2==0) {
//				prime=false;
//				break;
//			}
//		}
//		if(num==0) {
//			System.out.println("Not prime");
//			
//		}
//		else if(prime==true) {
//			System.out.println(" Prime");
//			
//		}
//		else {
//			System.out.println(" not Prime");
//		} 
		
//		int num=sc.nextInt();
//		int temp=1;
//		for(int i=1;i<=num;i++) {
//			temp=temp*i;
//		}
//		System.out.println(temp);
		
//		int num=sc.nextInt();
//		int rem;
//		int sum=0;
//		int count=0;
//		while(num>0) {
//		rem=num%10;
//		sum=sum+rem;
//		num=num/10;
//		count++;
//		}
//		System.out.println(sum);
//		System.out.println("Start point");
//		int start=sc.nextInt();
//		System.out.println("End point");
//		int end=sc.nextInt();
//		
//		for(int i=start;i<end;i++) {
//			if(i%2==0) {
//				System.out.println("Even");
//			}
//			else {
//				System.out.println("odd");
//			}
//		}
		
int num;
		//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				if(j-i<=0) {
//					if(j==0||j==2||j==4)
//						System.out.print("1");
//					else
//						System.out.print("0");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		for(int i=0;i<7;i++) {
//			for(int j=0;j<13;j++) {
//				if(j+i<=6||j-i>=6) {
//					if(j<7)
//						System.out.print((char)(65+j));
//					else
//						System.out.print((char)(76+(1-j)));
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				if(j-i<=0) {
//					System.out.print(i+j+2);
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	int year=2000;
//	if((year%4==0 && year%100!=0 )|| year%400==0) {
//		System.out.println("leap year");
//	}
//	else {
//		System.out.println("not");
//	}
	//pattern 27 & 28
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<5;j++) {
//				if(j-i<=0 && j+i<=8) {
//					System.out.print((char)(65+j));
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		pattern 31
//		for(int i=0;i<7;i++) {
//			for(int j=0;j<7;j++) {
//				if(j+i>=7) {
//					System.out.print((char)(65+i+j-7)+" ");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		pattern59
//	for(int i=0;i<9;i++) {
//		for(int j=0;j<5;j++) {
//			if(j-i>=0 || j+i>=8) {
//				if(i<5)
//					System.out.print(j+1-i);
//				else
//					System.out.print(j+i-7);
//			}
//			else {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//	}
//	pattern 72	
//	for(int i=0;i<5;i++) {
//		for(int j=0;j<9;j++) {
//			if(j+i>=4 && j-i<=4) {
//				if(j<5) 
//					System.out.print(i+j-3);
//				else
//					System.out.print(5-(j-i));
//			}
//			else {
//				System.out.print("");
//			}
//		}
//		System.out.println();
//	}
//		int num=sc.nextInt();
//		int num1=0;
//		int num2=1;
//		System.out.print(num1+" "+num2);
//		int nextNum;
//		for(int i=0;i<num;i++) {
//			nextNum=num1+num2;
//			System.out.print(" "+nextNum);
//			num1=num2;
//			num2=nextNum;
//			}
		do {
			System.out.println("Enter 1 fpr even");
			System.out.println(("Enter 2 for odd"));
			System.out.println("Enter 3 for prime finder");
			System.out.println("Enter 4 fo exit");
			 num=sc.nextInt();
			switch(num)
			{
			case 1:for(int i=0;i<100;i++) {
				if(i%2==0) {
					System.out.println("Even");
				}
			}
			break;
			case 2:for(int i=0;i<100;i++) {
				if(i%2!=0) {
					System.out.println("odd");
				}
			}
			break;
			case 3:for(int i=0;i<100;i++) {
				boolean prime=true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						prime=false;
						break;
					}
					if(prime==true) {
						System.out.println("Prime");
					}
				}
			}
			break;
			case 4: System.exit(0);
			break;
			}
		}while(num<=4);
			
			
			
		}
		}
	


