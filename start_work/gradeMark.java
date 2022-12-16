package start_work;

import java.util.Scanner;

public class gradeMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five subject marks");
		int s1,s2,s3,s4,s5,total;
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		
		total=s1+s2+s3+s4+s5;
		System.out.println("Total number is "+total);
		int persent=(total*100)/500;
		System.out.println("Persentage is "+persent);
		
		if(persent>=90&&persent<=100) {
			System.out.println("Grade A");
		}
		else if(persent>=80&&persent<=90) {
			System.out.println("Grade B");
		}
		else if(persent>=70&&persent<=80) {
			System.out.println("Grade C");
		}
		else if(persent>=60&&persent<=70) {
			System.out.println("Grade D");
			
		}
		else {
			System.out.println("Grade E");
		}
	}

}
