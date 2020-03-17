package LibDBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import lib.Book;

public class DBTest {

	private static final String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "SYSTEM";
	private static final String password = "A123456a";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection myconn = null;
//		Statement st = null;
//		ResultSet res = null;

		try {
			myconn = DriverManager.getConnection(dbURL, user, password);
			System.out.println("Connected");
//			st = myconn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//			res = st.executeQuery("SELECT * FROM BOOK");
//			res.next();
			ViewTable vt = new ViewTable();
			vt.viewTable(myconn, "Book");
			
			ListOfBooks lob = new ListOfBooks();
			ArrayList<Book> bookList = lob.getBooks(myconn);
			for(Book book: bookList) {
				System.out.println(book);
			}
			
//			vt.viewTable(myconn, "member");
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			if (myconn != null) {
//				res.close();
//				st.close();
				myconn.close();
			}
		}
	}

}
