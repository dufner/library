package com.example.Library.data;

import com.example.Library.entity.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,String> {
}
