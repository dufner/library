package com.example.Library.data;

import com.example.Library.entity.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,String> {
}
