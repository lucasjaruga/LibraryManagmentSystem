package pl.jarugalucas.libraryManagmentSystem.model;

// this is POJO

import java.util.*;
import javax.persistence.*;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; // klucz główny (primary key)
	
	private String firstName;
	private String lastname;
	
	@ManyToMany(mappedBy = "authors")
	private Set<Book> books;
	
	public Author(String firstName, String lastname, Set<Book> books) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.books = books;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}