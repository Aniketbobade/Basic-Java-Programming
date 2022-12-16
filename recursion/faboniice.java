package recursion;

public class faboniice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int firstNum=0;
		int secondnum=1;
		int nexNum=0;
		System.out.print(0+" "+1);
		loopI(num,firstNum,secondnum,nexNum);
	}

	private static void loopI(int num, int firstNum, int secondnum, int nexNum) {
		// TODO Auto-generated method stub
	if(num>0) {
		nexNum=firstNum+secondnum;
		System.out.print(" "+nexNum);
		firstNum=secondnum;
		secondnum=nexNum;
		num--;
	loopI(num, firstNum, secondnum, nexNum);	
	}
	}

}
