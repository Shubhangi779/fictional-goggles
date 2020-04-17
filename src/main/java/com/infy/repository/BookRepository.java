package com.infy.repository;

import com.infy.model.Book1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book1, Integer>{
}
