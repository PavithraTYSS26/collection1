package collectionAssignmentTyss;

import java.util.LinkedList;

public class Program9ReadFirstElementFromLinkedList {

	public static void main(String[] args) {
		LinkedList<String> arrl = new LinkedList<>();
		arrl.add("gowri");
		arrl.add("poonam");
		arrl.add("savith");
		arrl.add("sweetha");
		
		System.out.println("Fiest Element: "+arrl.element());
		System.out.println("Fiest Element: "+arrl.getFirst());
		System.out.println("Fiest Element: "+arrl.peek());
		System.out.println("Fiest Element: "+arrl.peekFirst());
	
	}

}
