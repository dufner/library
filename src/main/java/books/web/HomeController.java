package books.web;

import books.data.AuthorRepository;
import books.data.BookRepository;
import books.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping("/home")
public class HomeController {

    private final BookRepository bookRepo;
    private final AuthorRepository authorRepository;

    @Autowired
    public HomeController(
            BookRepository ingredientRepo,
            AuthorRepository authorRepository) {
        this.bookRepo = ingredientRepo;
        this.authorRepository=authorRepository;
    }

    @GetMapping("/findAll")
    public @ResponseBody Iterable<Book> findAll() {

        return bookRepo.findAll();
    }

    @GetMapping("/findById")
    public @ResponseBody Optional<Book> findByID(String id) {
        return bookRepo.findById(id);
    }



    @DeleteMapping("/deleteById")
    public void deleteByID(String id) {
      bookRepo.deleteById(id);
    }


}
