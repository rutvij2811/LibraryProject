package lib;

import java.util.List;

public class Library{
	
	public boolean issueBook(final Book book) {
		book.issued = true;
		if (book.issued) {
			return true;
		} else
			return false;
	}

	public boolean issueBooks(final List<Book> books) {
		for (final Book book : books) {
			if (issueBook(book)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	// TODO : some method to retrieve list of mem_ID from the database;
	private boolean checkMemberId(final Member mem) {
		final List<Integer> memList = null;// Some code to retrieve memId from DB
		if(memList.contains(mem.memId)) {
			return true;
		}
		return false;
	}
}