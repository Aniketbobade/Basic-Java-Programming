package ArrayInRecusion;

public class SpecificElement {
static	int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int ele=4;
		
		loop1(0,a,ele);
		
		if(cnt==0) {
			System.out.println("not presnet");
		}else {
			System.out.println("present");
		}
	}

	private static void loop1(int i, int[] a, int ele) {
		// TODO Auto-generated method stub
	if(i<a.length) {
		if (ele==a[i]) {
			cnt++;
		}

		i++;
		loop1(i, a, ele);
	}
	}

}
