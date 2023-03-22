package com.example.Library.services;

import com.example.Library.data.AuthorRepository;
import com.example.Library.data.BookRepository;
import com.example.Library.entity.Book;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;
@Server
public interface BookServer {

     Iterable<Book> findAll() ;


     Optional<Book> findByID(String id) ;

    void deleteByID(String id);

}
