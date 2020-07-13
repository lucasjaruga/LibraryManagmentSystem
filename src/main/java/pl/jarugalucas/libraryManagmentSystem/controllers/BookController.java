package pl.jarugalucas.libraryManagmentSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.jarugalucas.libraryManagmentSystem.repositories.BookRepository;

@Controller
public class BookController {
	
	private final BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
		// injection of bookRepository to BookController
	}
	
	// when Spring gets request for /books url, this will execute getBooks method
	@RequestMapping("/books")
	public String getBooks(Model model) {
		
		// adds all books to the model and next it'll return model to view layer
		model.addAttribute("books", bookRepository.findAll());
		
		return "books/list";
	}
}