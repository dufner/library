package books;

import books.data.AuthorRepository;
import books.data.BookRepository;
import books.entity.Author;
import books.entity.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;


@SpringBootApplication
@EntityScan("books.*")
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }
    @Bean
    public CommandLineRunner dataLoader(BookRepository repo, AuthorRepository authorRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Book storiesOfNature = new Book("123", "Stories of Nature", Book.TypeOfBook.NATURE);
                repo.save(storiesOfNature);
                repo.save(new Book("1234", "Crime Stories", Book.TypeOfBook.CRIME));
                repo.save(new Book("12345", "100 Jokes", Book.TypeOfBook.COMEDY));
                repo.save(new Book("123456", "Dante", Book.TypeOfBook.DRAMA));
                Author entity = new Author((long)1243,"Gromov",new Date(1986,12,6), List.of(storiesOfNature));
                authorRepository.save(entity);
            }
        };
    }
}
