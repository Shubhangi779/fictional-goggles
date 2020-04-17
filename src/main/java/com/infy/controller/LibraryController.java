package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.Book1Dto;
import com.infy.dto.LibraryDto;
import com.infy.model.Library;
import com.infy.service.LibraryService;

@RestController
@RequestMapping(value="/search")
public class LibraryController {

	@Autowired
	LibraryService libarayService;
	
	@GetMapping(value = "/test")
	public String showData() {
		return "RestAPI";		
	}
	
	
	@GetMapping(value = "/all")
	public List<Library> getAllLibrary(){
		return libarayService.getAllLibrary();
		
	}
	
	@PostMapping(value = "/save")
	public void saveLibrary(@RequestBody LibraryDto library) {
		libarayService.saveLibrary(library);
	}
	
	@PostMapping(value = "/insertBookdata")
	public void saveBook(@RequestBody Book1Dto book1Dto) {
		 libarayService.saveBook(book1Dto);
	}
}
