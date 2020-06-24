package pl.jarugalucas.libraryManagmentSystem.model;

public class Book {
	private Integer isbn;
	private String title;
	private String author;
	
	public Book(Integer isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
}