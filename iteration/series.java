package iteration;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int previusterm,currentTerm,NextTerm;
		previusterm=0;
		currentTerm=1;
		NextTerm=0;
		
		for(int i=1;i<=15;i++) {
			NextTerm=previusterm+(currentTerm*2);
			System.out.print(" "+NextTerm);
			previusterm=currentTerm;
			currentTerm=NextTerm;
		}
	}

}
