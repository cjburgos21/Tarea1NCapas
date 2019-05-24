package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Book;
import com.uca.capas.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	public BookService bookservice;
	

	
	@RequestMapping("/vertodos")
	public ModelAndView verTodos() {
		ModelAndView mav = new ModelAndView();
		List<Book> books = bookservice.findAll();
		int sumando = bookservice.sumtotal();
		String cabeza = "Hay " + Integer.toString(sumando)+ " libros en existencia, "+ " de " + Integer.toString(bookservice.dautores())+ " cantidad de autores diferentes";
		mav.addObject("cabeza", cabeza);
		mav.addObject("books", books);
		mav.setViewName("book/books");
		
		return mav;
	}
	

}
