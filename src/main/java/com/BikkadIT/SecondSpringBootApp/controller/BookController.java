package com.BikkadIT.SecondSpringBootApp.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SecondSpringBootApp.entity.Book;

@Controller
@RequestMapping("/api")
public class BookController {

	@GetMapping(value="/gettingBookData")
	public String getBook(Model model) {
		
		Book b=new Book();
		b.setBookId(111);
		b.setBookName("Java");
		b.setBookPrice(123.00);
		
		model.addAttribute("book", b);
		return "BookData";
		
	}
	
	@GetMapping("/gettingAllBook")
	public ModelAndView getAllBook() {
		
		Book b=new Book();
		b.setBookId(10);
		b.setBookName("Java");
		b.setBookPrice(123.00);
		
		Book b1=new Book();
		b1.setBookId(20);
		b1.setBookName("C++");
		b1.setBookPrice(123.00);
		
		Book b2=new Book();
		b2.setBookId(30);
		b2.setBookName("CoreJava");
		b2.setBookPrice(250.00);
		
		Book b3=new Book();
		b3.setBookId(40);
		b3.setBookName("Paython");
		b3.setBookPrice(123.00);
		
		ArrayList al=new ArrayList();
		al.add(b);
		al.add(al);
		al.add(b2);
		al.add(b3);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("listbook", al);
		mav.setViewName("book1");
		return mav;
		
	}
}
