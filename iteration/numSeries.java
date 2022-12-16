package iteration;

public class numSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pinkCount=0;
		int yellowCount=0;
		int pinkAndYellowCount=0;
		for(int i=33;i<=999;i++) {
			if((i%3==0)&&(i%5==0)) {
				System.out.println("Pink and Yellow");
				pinkAndYellowCount++;
			
			}
			else if(i%3==0){
				System.out.println("Pink");
				pinkCount++;
			}
			else if(i%5==0) {
				System.out.println("Yellow");
				yellowCount++;
				
			}
			else {
				System.out.println(i);
			}
			
		}
		System.out.println("Pink And Yellow Count is "+pinkAndYellowCount);
		System.out.println("Pink Count is "+pinkCount);
		System.out.println("Yellow count is"+yellowCount);
		
	}

}
