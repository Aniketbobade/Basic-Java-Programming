package author;

public class AuthorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book("Java", 500, new Author("Aniket", "Pune", 55));
		book.showDetails();
	}

}
