package start_work;

public class simpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principle,rate,time,SI;
//		principle=5000;
//		rate=3;
//		time=2;
//		SI=(principle*rate*time)/100;
//		System.out.println("Simple intrest is "+SI);
//		
		int p,r,n,t;
		p=2000;
		r=2;
		n=5;
		t=3;
		int	a=(int) (p*Math.pow((1+(r/n)), n*t));
		System.out.println(a );
		
	}

}
