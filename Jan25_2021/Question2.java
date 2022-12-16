package Jan25_2021;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
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
		
		int partSum=part1+part2;
		if (num==partSum) {
			System.out.println("Karpekar");
		}
		else {
			System.out.println("not");
		}
	}

}
