import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import lib.Member;
import test.MemberAdd;
import test.ViewMembers;

public class Main {
	public static void main(String[] args) throws IOException {
		LinkedList<Member> members = null;
		File file = new File("..\\LibraryProject\\res\\member.ser");
		if (file.exists()) {
			ViewMembers.initMembers(members);
		} else {
			MemberAdd.addMembers();
			ViewMembers.initMembers(members);
		}
	}
}
