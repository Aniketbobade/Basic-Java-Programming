package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Initialization
		int fact=1;
		int num=5;
//		Create method and take back return value
		fact=LoopI(1,fact,num); // provide all value required in loop
		System.out.println(fact);
	}

	private static int LoopI(int i, int fact, int num) {
		// TODO Auto-generated method stub
//		condition
//		condition include statement , inc or dec condition;
		if(i<=num) {
			fact=fact*i;
			i++;
			fact=LoopI(i, fact, num);
		}
		return fact;
	}

}
