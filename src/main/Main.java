package main;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import LibDBUtil.DBConn;
import LibDBUtil.ListOfBooks;
import MemberUtil.MemberAdd;
import MemberUtil.ViewMembers;
import lib.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		LinkedList<Member> members = null;
		File file = new File("..\\LibraryProject\\res\\member.ser");
		if (file.exists()) {
			ViewMembers.initMembers(members);
		} else {
			MemberAdd.addMembers();
			ViewMembers.initMembers(members);
		}
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Press 1 to issue the book");
			System.out.println("Press 2 to issue the multiple books");
			System.out.println("Press 3 to add member");
			System.out.println("Press 4 to checkDues");
			System.out.println("Press 5 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				issueBook();
				break;
			case 2:
				issueBooks();
				break;
			case 3:
				addMember();
				break;
			case 4:
				checkDues();
				break;
			case 5:
				isRunning = false;
				break;
			default:
				System.out.println("Choice not in the list");
				break;
			}
		}
	}

	private static void checkDues() {
		// TODO Auto-generated method stub

	}

	private static void addMember() {
		// TODO Auto-generated method stub

	}

	private static void issueBooks() {
		// TODO Auto-generated method stub

	}

	private static void issueBook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book name");
		ArrayList<Book> bookList = ListOfBooks.getBooks(DBConn.myconn);
		String name = sc.nextLine();
		for (Book b : bookList) {
			if (b.getName().equalsIgnoreCase(name) && !b.isIssued()) {
				// code to issue book
			}
		}
	}
}
