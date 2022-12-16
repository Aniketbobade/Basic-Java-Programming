package IMP1;

public class SumOf1stNPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i < 20; i++) {
			boolean flag=true;
			for (int j = 2; j <i; j++) {
				if (i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				//System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
