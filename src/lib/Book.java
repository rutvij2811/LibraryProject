package lib;

import java.util.Date;

public class Book {

	String isbnNumber;
	String name, author;
	int yearOfPublishing;
	boolean issued;
	Date returnDeadline;
	int memberID;
	public Book(String isbnNumber, String name, String author, int yearOfPublishing, boolean issued,
			Date returnDeadline, int memberID) {
		super();
		this.isbnNumber = isbnNumber;
		this.name = name;
		this.author = author;
		this.yearOfPublishing = yearOfPublishing;
		this.issued = issued;
		this.returnDeadline = returnDeadline;
		this.memberID = memberID;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ISBN: " + isbnNumber +"\n"
				+ "Book Name: "+ name +"\n"
						+ "Author: " + author + "\n";
	}
}