package pl.jarugalucas.libraryManagmentSystem.model;

// this is POJO

import java.util.*;
import javax.persistence.*;

@Entity
public class Book {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id; // klucz główny (primary key)
	
	private String isbn;
	private String title;
	
	@ManyToOne
	private Publisher publisher;
	
	@ManyToMany
	@JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
			inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author> authors = new HashSet<>();
	
	public Book() {
	}
	
	public Book(String title, String isbn) {
		this.isbn = isbn;
		this.title = title;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Author> getAuthor() {
		return authors;
	}

	public void setAuthor(Author author) {
		this.authors.add(author);
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Book book = (Book) obj;
		
		return id != null ? id.equals(book.id) : book.id == null;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", authors=" + authors + "]";
	}
	
}