import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import lib.Member;
import test.MemberAdd;
import test.ViewMembers;

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
		while(isRunning) {
			System.out.println("Press 1 to issue the book");
			System.out.println("Press 2 to issue the multiple books");
			System.out.println("Press 3 to add member");
			System.out.println("Press 4 to checkDues");
			System.out.println("Press 5 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: issueBook();
				break;
			case 2: issueBooks();
			break;
			case 3: addMember();
			break;
			case 4: checkDues();
			break;
			case 5: isRunning = false;
			break;
			default:System.out.println("Choice not in the list");
				break;
			}
		}
	}
}
