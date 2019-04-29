package collectionAssignmentTyss;

import java.util.LinkedList;

public class program10ReadLastElementFromLinkedList {

	public static void main(String[] args) {
		LinkedList<String> arrl = new LinkedList<>();
		arrl.add("gowri");
		arrl.add("poonam");
		arrl.add("savith");
		arrl.add("sweetha");
		
		System.out.println("Last Element: "+arrl.getLast());
		System.out.println("Last Element: "+arrl.peekLast());
		
	
	}

}
