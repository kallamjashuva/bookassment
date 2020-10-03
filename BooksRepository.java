package com.book.springbootcrudoperation.repository;

import org.springframework.data.repository.CrudRepository;

import com.book.springbootcrudoperation.entity.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
