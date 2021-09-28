package com.example.demo.controllers;
import java.awt.print.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.content.Books;




@Controller
public class BookController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
  public String indexModel(Model model) {
    model.addAttribute("book", new Books());
    return "index";
  }

  @PostMapping("/hello")
  public String showAll(Model model) {
    model.addAttribute("book", Books.findAll());
    return "result";
  }
}
