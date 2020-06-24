package pl.jarugalucas.libraryManagmentSystem.model;

//this is POJO

import java.util.*;
import javax.persistence.*;

@Entity
public class Book {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id; // klucz główny (primary key)
	
	private Integer isbn;
	private String title;
	
	@ManyToMany
	@JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
			inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author> authors;
	
	public Book(Integer isbn, String title, Set<Author> authors) {
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
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
	
}