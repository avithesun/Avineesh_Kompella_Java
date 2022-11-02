package com.company.Summative2KompellaAvineesh.Repository;

import com.company.Summative2KompellaAvineesh.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

    List<Book> findAllBooksByAuthorId(int authorId);

}