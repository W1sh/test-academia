package pt.com.everis.academia.java;

public class Book {
	
	private String isbn;

	public Book(String isbn) {
		super();
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Book book1 = new Book("1234");
		Book book2 = new Book("1234");
		System.out.println(book1.equals(book2));
	}

}
