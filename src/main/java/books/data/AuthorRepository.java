package books.data;

import books.entity.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,String> {
}
