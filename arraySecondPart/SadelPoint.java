package arraySecondPart;

public class SadelPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean flags=true;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				int ele = a[i][j];
				int count1 = 0;
				int count2 = 0;
				
				for (int k = 0; k < a.length; k++) {
					if (ele > a[i][k]) {
						count1++;
					}
					if (ele < a[k][j]) {
						count2++;
					}
				}
				if (count1 == 0 && count2 == 0) {
					System.out.println("Sadel Point " + a[i][j]);
					flags=false;
					break;
				}
			}
		}
		if(flags) {
			System.out.println("not found");
		}
	}
}
