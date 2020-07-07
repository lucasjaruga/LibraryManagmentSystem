package pl.jarugalucas.libraryManagmentSystem.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import pl.jarugalucas.libraryManagmentSystem.model.Author;
import pl.jarugalucas.libraryManagmentSystem.model.Book;
import pl.jarugalucas.libraryManagmentSystem.model.Publisher;
import pl.jarugalucas.libraryManagmentSystem.repositories.AuthorRepository;
import pl.jarugalucas.libraryManagmentSystem.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Author robert = new Author("Robert C.", "Martin");
		Book cc = new Book("Clean Code", "123123");
		robert.getBooks().add(cc);
		cc.getAuthor().add(robert);

		// saving into database
		authorRepository.save(robert);
		bookRepository.save(cc);

		Author herbert = new Author("Herbert", "Schildt");
		Book jtcr = new Book("Java The Complete Reference", "124124");
		herbert.getBooks().add(jtcr);
		jtcr.getAuthor().add(herbert);

		// saving into database
		authorRepository.save(herbert);
		bookRepository.save(jtcr);
		
		// --------------------------------------------------------------------
		
		Publisher helion = new Publisher("Helion", "ul. Kościuszki 1c", "Gliwice", "Mazowieckie", "44-100");
		
		
		
		
		System.out.println("Started in Bootstrap");
		System.out.println("Number of Books: " + bookRepository.count());
	}
}