package kr.jhta.bookstore;

import java.util.Date;

public class Rental {
	private customer cus;
	private Book book;
	private Date rentdate;
	private boolean isback;

	public Rental() {}

	public Rental(customer cus, Book book, Date rentdate, boolean isback) {
		super();
		this.cus = cus;
		this.book = book;
		this.rentdate = rentdate;
		this.isback = isback;
	}

	public customer getCus() {
		return cus;
	}

	public void setCus(customer cus) {
		this.cus = cus;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getRentdate() {
		return rentdate;
	}

	public void setRentdate(Date rentdate) {
		this.rentdate = rentdate;
	}

	public boolean isIsback() {
		return isback;
	}

	public void setIsback(boolean isback) {
		this.isback = isback;
	}
	

	
}
