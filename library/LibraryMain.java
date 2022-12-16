package library;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setLibName("MordernLibrary");
		user.setLibrarianName("Ani");
		user.setAddress("Pune");
		user.setReg_id(0);
		
		user.setName("HackTech");
		user.setAuthor("AniBob");
		user.setBookId(2511);
		user.setCost(250);
		
		user.setUserName("Aniket_Bobade");
		user.setUserId(221155);
		user.setUserContactNo("7030842378");
		user.setDateOfIssue("15/09/2022");
		user.setDateOfReturn("25/09/2022");
	System.out.println("** Library Info  **");
	System.out.println("Library Name "+user.getLibName());	
	System.out.println("Librarian Name is "+user.getLibrarianName());
	System.out.println("Address of Library "+user.getAddress());
	System.out.println("Library Id "+user.getReg_id());
	System.out.println("**  Book info **");
	System.out.println("Book Name "+user.getName());
	System.out.println("Author "+user.getAuthor());
	System.out.println("Book Id "+user.getBookId());
	System.out.println("Book Price "+user.getCost());
	System.out.println("** User Info  **");
	System.out.println("User Name "+user.getUserName());
	System.out.println("User Id "+user.getUserId());
	System.out.println("User Contact no. "+user.getUserContactNo());
	System.out.println("User Issue Book Date "+user.getDateOfIssue());
	System.out.println("User Retrun Book Date "+user.getDateOfReturn());
	
	
		
	}

}
