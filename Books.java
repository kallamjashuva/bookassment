package com.book.springbootcrudoperation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bookid")
	private int bookid;
	@Column(name="book_title")
	private String booktitle;
	
	@Column(name="author")
	private String author;
	
	@Column(name="year_published")
	private int yearpublished;
	
	public Books() {
		
	}
	public Books(String booktitle, String author, int yearpublished) {
		super();
		this.booktitle = booktitle;
		this.author = author;
		this.yearpublished = yearpublished;
	}
	
	public int getBookId() {
		return bookid;
	}

	public void setBookId(int bookid) {
		this.bookid = bookid;
	}
	public String getbooktitle() {
		return booktitle;
	}

	public void setbooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getauthor() {
		return author;
	}

	public void setauthor(String author) {
		this.author = author;
	}

	public int getyearpublished() {
		return yearpublished;
	}

	public void setyearpublished(int yearpublished) {
		this.yearpublished = yearpublished;
	}

	//define toString

	@Override
	public String toString() {
		return "Employee [bookid=" + bookid + ", booktitle=" + booktitle + ", author=" + author + ", yearpublished=" + yearpublished + "]";
	}
		

}
