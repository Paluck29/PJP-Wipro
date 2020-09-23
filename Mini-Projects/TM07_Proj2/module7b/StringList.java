package module7b;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringList {
	
	List<String> ls = new CopyOnWriteArrayList<String>();
	
	public boolean insertString(String str) {
		System.out.println("Inserted successfully");
		return ls.add(str);
	}
	
	public String deleteString(String str) {
		String msg = "Item does not exist";
		Iterator<String> it = ls.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			if(s.equals(str)) {
				ls.remove(s);
				msg = "Deleted successfully";
			}
		}
		
		return msg;
	}
	
	public String searchString(String str) {
		String msg = "Item not found in the list";
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(s.equals(str)) {
				msg = "Item found in the list";
			}
		}
		
		return msg;	
	}
	
	public void printAll() {
		for(String t: ls) {
			System.out.println(t);
		}
	}
	
	
}
