package recursion;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int fact=1;
		int x=loopI(1,num,fact);
	System.out.println(x);	
	}

	private static int loopI(int i, int num, int fact) {
		// TODO Auto-generated method stub
		if(i<=num) {
			fact=fact*i;
			i++;
			fact=loopI(i, num, fact);
		}
		return fact;
	}

}
