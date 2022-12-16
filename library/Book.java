package library;

public class Book extends Library {
String name,author;
int bookId;
float cost;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}


}
