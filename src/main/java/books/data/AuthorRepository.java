package books.data;

import books.Author;
import books.Book;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,String> {
}
