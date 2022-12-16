package recursion;

public class Pattern21 {
public static void main(String[] args) {
	loopI(0);
	for (int i = 0; i < 5 ; i++) {
		
	}
}

private static void loopI(int i) {
	// TODO Auto-generated method stub
	if(i<5) {
		loopJ(0,i);
		System.out.println();
		i++;
		loopI(i);
	}
}

private static void loopJ(int j, int i) {
	// TODO Auto-generated method stub
	if(j<10) {
		if(j+i>=4 && j+i<=8) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
		j++;
		loopJ(j, i);
	}
}
}
