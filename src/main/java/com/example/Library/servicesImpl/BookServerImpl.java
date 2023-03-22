package com.example.Library.servicesImpl;

import com.example.Library.data.AuthorRepository;
import com.example.Library.data.BookRepository;
import com.example.Library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;


public class BookServerImpl {

    private final BookRepository bookRepo;


    @Autowired
    public BookServerImpl(
            BookRepository ingredientRepo,
            AuthorRepository authorRepository) {
        this.bookRepo = ingredientRepo;
//        this.authorRepository=authorRepository;
    }


    public @ResponseBody Iterable<Book> findAll() {

        return bookRepo.findAll();
    }


    public @ResponseBody Optional<Book> findByID(String id) {
        return bookRepo.findById(id);
    }




    public void deleteByID(String id) {
      bookRepo.deleteById(id);
    }


}
