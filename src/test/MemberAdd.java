package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import lib.Member;

public class MemberAdd {
	public static void main(String[] args) throws IOException {
		LinkedList<Member> members = new LinkedList<>();
		members.add(new Member(1000,"MEM1",3,null));
		members.add(new Member(1001,"MEM2",2,null));
		members.add(new Member(1002,"MEM3",3,null));
		members.add(new Member(1003,"MEM4",1,null));
		members.add(new Member(1004,"MEM5",2,null));
		members.add(new Member(1005,"MEM6",4,null));
		members.add(new Member(1006,"MEM7",5,null));
		members.add(new Member(1007,"MEM8",2,null));
		members.add(new Member(1008,"MEM9",3,null));
		members.add(new Member(1009,"MEM10",3,null));
		
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream= null;
		try {
			fileOutputStream = new FileOutputStream("..\\LibraryProject\\res\\member.ser");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			for(Member mem: members) {
				objectOutputStream.writeObject(mem);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			objectOutputStream.close();
		}
		
		
		

	}
	
}
