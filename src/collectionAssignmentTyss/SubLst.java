package collectionAssignmentTyss;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SubLst {
	public static void main(String[] args) {
		 
	    // Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Item1");
	    linkedlist.add("Item2");
	    linkedlist.add("Item3");
	    linkedlist.add("Item4");
	    linkedlist.add("Item5");
	    linkedlist.add("Item6");
	    linkedlist.add("Item7");
	 
	    // Displaying LinkedList elements
	    System.out.println("LinkedList elements:");
	     Iterator it = linkedlist.iterator();
	    while(it.hasNext()){
	       System.out.println(it.next());
	    }
	 
	    // Obtaining Sublist from the LinkedList
	    List sublist = linkedlist.subList(2,5);
	 
	    // Displaying SubList elements
	    System.out.println("\nSub List elements:");
	    Iterator subit= sublist.iterator();
	    while(subit.hasNext()){
	       System.out.println(subit.next());
	    }
	 

}
}
