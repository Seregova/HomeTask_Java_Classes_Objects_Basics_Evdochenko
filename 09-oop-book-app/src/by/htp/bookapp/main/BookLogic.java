package by.htp.oopbookapp.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookLogic {

	public Book[] generateBook() {

		Book[] bookArray = new Book[5];
		
		String[] title = new String[]{"Java", "C++", "Python", "Delphi", "Go"};
		String[] author = new String[]{"Java_Author", "Java_Author", "Python_Author", "Delphi_Author", "Go_Author"};
		String[] publisher = new String[]{"Java_Publisher", "C++_Publisher", "Python_Publisher", "Delphi_Publisher", "Go_Publisher"};
		int[] publishYear = new int[] {2010, 2011, 2012, 2013, 2015};
		int[] pageNumber = new int[] {1000, 1500, 500, 800, 600};
		double[] price = new double[] {500.11, 350.12, 290.99, 130.29, 499.99 };
		String[] cover = new String[]{"Hard", "Hard", "Paper", "Hard", "Soft"} ;
						
		for(int i = 0; i <bookArray.length; i++) {
			Book b = new Book();
			b.setTitle(title[i]);
			b.setAuthor(author[i]);
			b.setPublisher(publisher[i]);
			b.setPublishYear(publishYear[i]);
			b.setPageNumber(pageNumber[i]);
			b.setPrice(price[i]);
			b.setCover(cover[i]);
			bookArray[i] = b; 
		}
		
		return bookArray;
		
	}
	
	 public void authors(String author) {
		 
	        List<Book> authorBook = new ArrayList<Book>();
	        BookLogic book1 = new BookLogic();
			Book[] bookArray = book1.generateBook();
			
	        for (Book book: bookArray) {
	            if (book.getAuthor().equals(author)) {
	                authorBook.add(book);
	            }
	        }
	        System.out.println(authorBook);
	}
	 
	 public void publishers(String publisher) {
		 
	        List<Book> publishers = new ArrayList<Book>();
	        BookLogic book1 = new BookLogic();
			Book[] bookArray = book1.generateBook();
			
	        for (Book book: bookArray) {
	            if (book.getPublisher().equals(publisher)) {
	                publishers.add(book);
	            }
	        }
	       System.out.println(publishers);
	}
	
	 public void years(int year) {
		 
	        List<Book> yearBook = new ArrayList<Book>();
	        BookLogic book1 = new BookLogic();
			Book[] bookArray = book1.generateBook();
			
	        for (Book book: bookArray) {
	            if (book.getPublishYear()> year) {
	                yearBook.add(book);
	            }
	        }
	       System.out.println(yearBook);
	}
}
