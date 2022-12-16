package Prelim22Jan2021;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 20; j++) {
				if ((j-i<=0 && j<5)||(j+i<=9 && (j>4 && j<10)) || (j-i>=10 && (j>9 && j<15)) || ((j+i>=19)&&(j>14 && j<20))) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
