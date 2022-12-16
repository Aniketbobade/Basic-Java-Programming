package array;

import java.util.Scanner;

public class TotalInputforArray {
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Element of Array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		display(a);
	}
		void display(int a[]){
			System.out.println("Your array is ");
			for(int x:a) {
				System.out.println(x);
			}	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalInputforArray a=new TotalInputforArray();
		a.input();
//		a.display();
		
	}
	private void display() {
		// TODO Auto-generated method stub
		
	}

}
