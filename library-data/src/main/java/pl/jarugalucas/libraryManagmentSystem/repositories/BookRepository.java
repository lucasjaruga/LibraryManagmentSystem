package pl.jarugalucas.libraryManagmentSystem.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jarugalucas.libraryManagmentSystem.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
