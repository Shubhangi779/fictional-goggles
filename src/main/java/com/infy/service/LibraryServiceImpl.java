package com.infy.service;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.AuthorDto;
import com.infy.dto.Book1Dto;
import com.infy.dto.LibraryDto;
import com.infy.model.Author;
import com.infy.model.Book1;
import com.infy.model.Library;
import com.infy.repository.AuthorRepository;
import com.infy.repository.BookRepository;
import com.infy.repository.LibraryRepository;

@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired 
	LibraryRepository libraryRepository;
	@Autowired
	BookRepository bookRepository;
	@Autowired
	AuthorRepository authorRepository;
	

	public List<Library> getAllLibrary() {
 
		return libraryRepository.findAll();
	}

	public void saveLibrary(LibraryDto library) {
		Library lib = new Library();
		System.out.println("1Dto : "+library.getId()+" , "+library.getName());
		lib.setLibraryId(library.getId());
		lib.setLibraryName(library.getName());
		System.out.println("1 Entity :"+lib.getLibraryId()+" , "+lib.getLibraryName());
		libraryRepository.save(lib);
		
	}

	@Override
	public void saveBook(Book1Dto book1Dto) {
		Book1 book = new Book1();
		Author a = new Author();
		AuthorDto author = new AuthorDto();
		AuthorDto author1 = new AuthorDto();
		book.setId(book1Dto.getBookId());
		book.setTitle(book1Dto.getBookTitle());
		book.setDescription( book1Dto.getDescription());
		author.setId(10);
		author.setName("David");
		author1.setId(20);
		author1.setName("DavidSon");
		authorRepository.save(a);
        bookRepository.save(book);
				
	}

}
