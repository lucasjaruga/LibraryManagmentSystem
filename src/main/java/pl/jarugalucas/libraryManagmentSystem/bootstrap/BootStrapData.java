package pl.jarugalucas.libraryManagmentSystem.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import pl.jarugalucas.libraryManagmentSystem.model.Author;
import pl.jarugalucas.libraryManagmentSystem.model.Book;
import pl.jarugalucas.libraryManagmentSystem.model.Publisher;
import pl.jarugalucas.libraryManagmentSystem.repositories.AuthorRepository;
import pl.jarugalucas.libraryManagmentSystem.repositories.BookRepository;
import pl.jarugalucas.libraryManagmentSystem.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Started in Bootstrap");
		
		Publisher publisher = new Publisher();
		publisher.setName("Helion");
		publisher.setCity("Gliwice");
		publisher.setState("Mazowieckie");
		
		publisherRepository.save(publisher);
		
		System.out.println("Publisher count: " + publisherRepository.count());

		Author robert = new Author("Robert C.", "Martin");
		Book cc = new Book("Clean Code", "123123");
		robert.getBooks().add(cc);
		cc.getAuthor().add(robert);
		
		cc.setPublisher(publisher);
		publisher.getBooks().add(cc);

		// saving into database
		authorRepository.save(robert);
		bookRepository.save(cc);

		Author herbert = new Author("Herbert", "Schildt");
		Book jtcr = new Book("Java The Complete Reference", "124124");
		herbert.getBooks().add(jtcr);
		jtcr.getAuthor().add(herbert);
		
		jtcr.setPublisher(publisher);
		publisher.getBooks().add(jtcr);

		// saving into database
		authorRepository.save(herbert);
		bookRepository.save(jtcr);
		
		
		
		
		// --------------------------------------------------------------------

		System.out.println("Number of Books: " + bookRepository.count());
		System.out.println("Number of Authors: " + authorRepository.count());
		System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
		
		System.out.println(authorRepository.findAll());
	}
}