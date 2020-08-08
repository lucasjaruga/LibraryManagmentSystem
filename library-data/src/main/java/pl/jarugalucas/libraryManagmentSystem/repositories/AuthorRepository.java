package pl.jarugalucas.libraryManagmentSystem.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jarugalucas.libraryManagmentSystem.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
