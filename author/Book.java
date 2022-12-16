package author;

public class Book {
String bookName;
float price;
Author author;

public Book(String bookName, float price, Author author) {
	// TODO Auto-generated constructor stub
	this.bookName=bookName;
	this.price=price;
	this.author=author;
}

void showDetails()
{
	System.out.println("Book Name : "+bookName);
	System.out.println("Book price : "+price );
	System.out.println("Auther Dtails : ");
	
	System.out.println("Author NAme :"+author.getName());
	System.out.println("Author Age : "+author.getAge());
	System.out.println("Author Place: "+ author.getPlace());
}
}
