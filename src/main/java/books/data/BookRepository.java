package books.data;

import books.entity.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,String> {
}
