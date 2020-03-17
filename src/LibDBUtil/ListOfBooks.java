package LibDBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import lib.Book;

public class ListOfBooks {
	
	public static ArrayList<Book> getBooks(Connection con){
		ArrayList<Book> bookList = new ArrayList<>();
		Statement stmt = null;
		String query = "SELECT * FROM BOOK" ;
		
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				bookList.add(new Book(rs.getString("ISBN"),rs.getString("NAME"),rs.getString("Author"),rs.getInt("YOP"),rs.getBoolean("issued"),
						rs.getDate("return_date"),rs.getInt("mem_id")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookList;
	}
}
