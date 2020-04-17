package com.infy.service;

import java.util.List;

import com.infy.dto.Book1Dto;
import com.infy.dto.LibraryDto;
import com.infy.model.Library;

public interface LibraryService {

	public List<Library> getAllLibrary();
    public void saveLibrary (LibraryDto library);
    public void saveBook(Book1Dto book1Dto);
}
