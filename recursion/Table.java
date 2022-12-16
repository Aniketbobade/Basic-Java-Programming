package recursion;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		loopI(1,num);
		
	}

	private static void loopI(int i, int num) {
		// TODO Auto-generated method stub
		if(i<=10) {
			System.out.println(num+" * "+i+" = "+(num*i));
			i++;
			loopI(i, num);
		}
	}

}
