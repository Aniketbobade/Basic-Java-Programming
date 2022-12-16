package Loops;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		int firstNum=0;
		int secNum=1;
		System.out.print(firstNum+" "+secNum);
		for (int i = 0; i < num; i++) {
			int nextnum=firstNum+secNum;
			System.out.print(" "+nextnum);
			firstNum=secNum;
			secNum=nextnum;
		}
	}

}
