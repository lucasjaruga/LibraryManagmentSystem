package pl.jarugalucas.libraryManagmentSystem.repositories;

import pl.jarugalucas.libraryManagmentSystem.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{

}
