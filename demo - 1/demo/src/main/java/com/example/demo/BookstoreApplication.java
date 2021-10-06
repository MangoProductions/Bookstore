package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;

import content.Book;
import content.BookRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookListApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of le books");
			repository.save(new Book("Hänen saarensa", "Jorma Jallusaari", 2016, "1999939923232", 39.90));
			repository.save(new Book("Theater & its Double", "Antonin Artaud", 1938, "9781847493323", 10.60));	
			
			log.info("fetch all le books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}
