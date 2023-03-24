package com.example.Library.web;

import com.example.Library.data.AuthorRepository;
import com.example.Library.data.BookRepository;
import com.example.Library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@Controller
@RequestMapping
public class BookRestController {

    private final BookRepository bookRepo;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookRestController(
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
