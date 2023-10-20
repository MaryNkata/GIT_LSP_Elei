package org.howard.edu.lsp.midterm.problem1;

public class Book {
	
	private String author;
	private String title;
	private int year;
	
	public Book(String title, String author, int year) {
	this.author = author;
	this.title = title;
	this.year = year;
	}
	
	public String toString() {
		String result = "The book titled: " + title + " was written by: " + author + " in " + year;
		return result;
	}
	
	public boolean equals(Book new_book) {
		if (author != new_book.author || title != new_book.title || year != new_book.year) {
			return false;
		}
		return true;
	}
}
