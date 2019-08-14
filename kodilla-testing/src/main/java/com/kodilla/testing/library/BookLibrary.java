package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    public List<Book> listBookWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBookWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;

    }
    public List<Book> listBooksInHadsOf(LibraryUser libraryUser){
        List<Book> userBooks = libraryDatabase.listBookInHAndsOf(libraryUser);
        return userBooks;
    }
}

