package com.arionmathias.bookstore.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.arionmathias.bookstore.model.Book;
import com.arionmathias.bookstore.service.BookService;


@Controller
@RequestMapping({"/book","/"})
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping
	public ModelAndView viewListing(@PageableDefault(direction = Direction.ASC, size = 5, sort = "title") Pageable pagination,
			@RequestParam Map<String, String> filters) {
		// Note that view name does not start with '/', if it  does so the ViewResolver will not found
		// the file when package project into a jar
		ModelAndView mav = new ModelAndView("book/index.html");
		Page<Book> bookPage = bookService.findByPageFiltered(pagination, filters);
		mav.addObject("bookPage", bookPage);
		
		return mav;
	}

	@GetMapping("/create")
	public ModelAndView viewCreateBook(Book book) {
		ModelAndView mav = new ModelAndView("book/create.html");
		mav.addObject("book",book);
		return mav;
	}

	@PostMapping("/create")
	public ModelAndView createBook(Book book, BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		ModelAndView mav = null;
		if (bindingResult.hasErrors()) {
			List<String> errors = bindingResult.getAllErrors().stream().map((erro) -> erro.getDefaultMessage())
					.toList();
			redirectAttributes.addFlashAttribute("failureMessage", errors);
			redirectAttributes.addFlashAttribute("book", book);
			mav = new ModelAndView("redirect:/book/create");
		} else {
			book = bookService.create(book);
			redirectAttributes.addFlashAttribute("successMessage",
					"Book '%s' created successfuly.".formatted(book.getTitle()));
			mav = new ModelAndView("redirect:/book");
		}
		
		return mav;
	}

}
