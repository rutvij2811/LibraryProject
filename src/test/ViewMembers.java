package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import lib.Member;

public class ViewMembers {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream("..\\LibraryProject\\res\\member.ser");
			objectInputStream = new ObjectInputStream(fileInputStream);
			LinkedList<Member> members = (LinkedList<Member>) objectInputStream.readObject();
			for(Member mem : members) {
				System.out.println(mem);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
