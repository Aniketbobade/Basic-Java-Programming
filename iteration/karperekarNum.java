package iteration;

import java.util.Scanner;

public class karperekarNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		int temp=num;
		int square=num*num;
		int count=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		int num2=(int) Math.pow(10, count);
		int part1=square/num2;
		int part2=square%num2;
		
		int num3=part1+part2;
		if(num3==num) {
			System.out.println("Karperakar number");
		}
		else {
			System.out.println("Not");
		}
	}

}
