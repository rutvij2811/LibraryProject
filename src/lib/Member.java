package lib;

import java.io.Serializable;
import java.util.LinkedList;

public class Member implements Serializable {

	private static final long serialVersionUID = 1L;

	private int memId;
	private String name;
	private int issueLimit;
	private LinkedList<Book> issuedBooks;

	public Member(int memId, String name, int issueLimit, LinkedList<Book> issuedBooks) {
		super();
		this.memId = memId;
		this.name = name;
		this.issueLimit = issueLimit;
		this.issuedBooks = issuedBooks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemId() {
		return memId;
	}

	public void setMemId(int memId) {
		this.memId = memId;
	}

	public LinkedList<Book> getIssuedBooks() {
		return issuedBooks;
	}

	public void setIssuedBooks(LinkedList<Book> issuedBooks) {
		this.issuedBooks = issuedBooks;
	}

	public int getIssueLimit() {
		return issueLimit;
	}

	public void setIssueLimit(int issueLimit) {
		this.issueLimit = issueLimit;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memId + " " + name + " " + issueLimit ;
	}

}
