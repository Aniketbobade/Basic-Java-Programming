package ArrayInRecusion;

public class SumByPassingObj {
int sum,cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SumByPassingObj obj=new SumByPassingObj();
		int a[]= {1,2,3,4,5};
		int sum=0;
		int cnt=0;
		obj=loop1(0,sum,cnt,a,obj);
		System.out.println(obj.sum+" "+obj.cnt);
	}
	private static SumByPassingObj loop1(int i, int sum, int cnt, int[] a, SumByPassingObj obj) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			sum=sum+a[i];
			cnt++;
			i++;
			obj.sum=sum;
			obj.cnt=cnt;
			
			obj=loop1(i, sum, cnt, a, obj);
			
			
		}
		return obj;
	}

}
