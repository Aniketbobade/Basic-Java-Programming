package start_work;

public class yearFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=777;
		System.out.println("Total number of days are "+days);
		 int year=days/365;
		 System.out.println("year "+year);
		 
		 int remDaysForMonth=days%365;
		 int month=remDaysForMonth/30;
		 System.out.println("Month "+month);

		 int remday2ForWeek=remDaysForMonth%30;
		 int week=remday2ForWeek/7;
		 System.out.println("week "+week);
		
		 
		 int day=remday2ForWeek%7;
		 System.out.println("Days "+day);
		 
		  
	}

}
