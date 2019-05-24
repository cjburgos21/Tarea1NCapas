package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.BookDAO;
import com.uca.capas.domain.Book;
import com.uca.capas.service.BookService;

@Controller
public class MainController {
	
	@Autowired
	private BookService bookservice;
	
	@RequestMapping("/")
	public String initMain() {
		return "main";
	}
	
	@RequestMapping("/searchbook")
	public ModelAndView searchBook(@RequestParam String lista,@RequestParam String codigo) {
		ModelAndView mav = new ModelAndView();
		System.out.println(lista + " " + codigo);
		List<Book> c = bookservice.findBy(lista, codigo);
		String cabeza = "Se han encontrado " + Integer.toString(c.size())+" para "+ codigo + " en " + lista;
		if(c == null) {
			mav.addObject("resultado", 0);
			mav.setViewName("book");
		}
		else {
			mav.addObject("books", c);
			mav.addObject("cabeza" , cabeza);
			mav.setViewName("book/books");
		}

		return mav;
	}
	
}
