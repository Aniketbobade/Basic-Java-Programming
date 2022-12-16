package ArrayInRecusion;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int res[] = new int[2];
		int sum = 0;
		int cnt = 0;
	res=loop1(0, a, res, cnt, sum);
		
		System.out.println(res[0] + " " + res[1]);
	}

	private static int[] loop1(int i, int[] a, int[] res, int cnt, int sum) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			sum = sum + a[i];
			cnt++;
			i++;
			res[0]=sum;
			res[1]=cnt;
			res=loop1(i, a, res, cnt, sum);
		}
		return res;
	}

}
