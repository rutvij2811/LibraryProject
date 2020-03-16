package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewTable {

	public static void viewTable(Connection con, String dbName) throws SQLException {

		Statement stmt = null;
		String query = "SELECT * FROM " + dbName;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (dbName.equalsIgnoreCase("Book")) {
				System.out.println("Book Table");
				System.out.println();
				System.out.println("ISBN\tName\tAuthor");
				while (rs.next()) {
					String isbn = rs.getString("ISBN");
					String name = rs.getString("NAME");
					String auth = rs.getString("Author");
					System.out.println(isbn + "\t" + name + "\t" + auth);
				}
				System.out.println();
			} else if (dbName.equalsIgnoreCase("member")) {
				System.out.println("Member Table");
				System.out.println();
				System.out.println("Name\tMem_ID");
				while (rs.next()) {
					String name = rs.getString("NAME");
					int memid = rs.getInt("mem_id");
					System.out.println(name + "\t" + memid);
				}
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}

}
