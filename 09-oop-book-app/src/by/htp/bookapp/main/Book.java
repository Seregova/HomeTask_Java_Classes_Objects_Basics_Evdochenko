package by.htp.oopbookapp.main;

import java.util.Arrays;

public class Book {
	
	 	private String title;
	    private String author;
	    private String publisher;
	    private int publishYear;
	    private int pageNumber;
	    private double price;
	    private String cover;

	    public Book(String title, String author, String publisher, int publishYear, int pageNumber, double price, String cover) {
	    	this.title = title;
	    	this.author = author;
	    	this.publisher = publisher;
	    	this.publishYear = publishYear;
	    	this.pageNumber = pageNumber;
	    	this.price = price;
	    	this.cover = cover;
	    }

	    public Book() {
	    }
	    
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public int getPublishYear() {
			return publishYear;
		}

		public void setPublishYear(int publishYear) {
			this.publishYear = publishYear;
		}

		public int getPageNumber() {
			return pageNumber;
		}

		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getCover() {
			return cover;
		}

		public void setCover(String cover) {
			this.cover = cover;
		}
	    
		 @Override
		    public String toString() {
		        return getTitle() + " " + getAuthor() + " " + getPublisher() + " " + getPublishYear() + " " + getPageNumber() + " " + getPrice() + " " + getCover();
 		        		
		        		//getSurname() + " " + getGroup() + " " + Arrays.toString(getRate()); 
		        	//	+ ""
		        		//+ "{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", publisher='" + publisher + 
		        		//'\'' + ", publishYear=" + publishYear +", pageNumber=" + pageNumber + ", price=" + price + ", cover='" + cover + '\'' + '}';
		}
}