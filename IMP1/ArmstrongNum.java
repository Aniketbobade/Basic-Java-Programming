package IMP1;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1532;
		int temp=num;
		int result=0;
		while(temp!=0) {
			int rem=temp%10;
			result=(int) (result+Math.pow(rem, 3));
			temp=temp/10;
			
		}
		if (result==num) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
