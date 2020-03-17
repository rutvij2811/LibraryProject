package MemberUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import lib.Member;

public class ViewMembers {
	private static ObjectInputStream objectInputStream;

	public static void initMembers(LinkedList<Member> members) throws IOException {
		FileInputStream fileInputStream;
		objectInputStream = null;
		try {
			fileInputStream = new FileInputStream("..\\LibraryProject\\res\\member.ser");
			objectInputStream = new ObjectInputStream(fileInputStream);
			members = ((LinkedList<Member>) objectInputStream.readObject());
			for(Member mem : members) {
				System.out.println(mem);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			objectInputStream.close();
		}
	   
	    
	    
	}
}
