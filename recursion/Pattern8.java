package recursion;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop1(0,9);
		
	}

	private static void loop1(int i, int a) {
		// TODO Auto-generated method stub
		if(i<a) {
			loop2(0,5,i);
			
			System.out.println();
			i++;
			loop1(i,a);
		}
	}

	private static void loop2(int j, int b, int i) {
		// TODO Auto-generated method stub
		if(j<b) {
			if (j + i >= 4 && j - i >=-4) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			j++;
			loop2(j,b,i);
		}
	}

}
