package practiceWork;

public class newConditionLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2021;
		if((year%100==0)&&(year%400==0)) {
			System.out.println("leap");
		}
		else if((year%100!=0)&&(year%4==0)) {
			System.out.println("leap");
		}
		else {
			System.out.println("not leap");
		}
	}

}
