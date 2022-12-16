package prelimsetA4April;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		while(num<0) {
			rem=num%10;
			sum=sum+rem;
			temp=temp/10;
		}
		
		if(num%sum==0) {
			System.out.println("harshad");
		}
		else{
			System.out.println("not");
		}
	}

}
