package pt.com.everis.academia.java;

public class Book {
	
	private String isbn;

	public Book(String isbn) {
		this.isbn = isbn;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("1234");
		Book book2 = new Book("1234");
		System.out.println(book1.equals(book2));
	}

}
