package com.example.bookstore.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.model.*;
import com.example.bookstore.service.*;
@RestController
public class HomeController {
	@Autowired
	BookService s;
	@PostMapping("add")
	public ResponseEntity<Book> get1(@RequestBody Book book) {
	    Book s1 = s.get(book);
	    return ResponseEntity.status(HttpStatus.CREATED).body(s1);
	}

	@GetMapping("details")
	  public List<Book> get123() {
		  
        return s.get11();
    }
	
	  @GetMapping("details/{id}")
	  public ResponseEntity<Book> get678(@PathVariable Long id)
	  {
	        Optional<Book> book = s.get2(id);
	        return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

	  }

}
