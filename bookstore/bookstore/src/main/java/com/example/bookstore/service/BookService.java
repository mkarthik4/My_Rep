package com.example.bookstore.service;
import com.example.bookstore.model.*;
import com.example.bookstore.dao.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	BookResp r;
	public Book get(Book b)
	{
		return r.save(b);
	}
	
	public List<Book> get11()
	{
		return r.findAll();
	}
	
	public Optional<Book> get2(Long id)
	{
		return r.findById(id);
	}

}
