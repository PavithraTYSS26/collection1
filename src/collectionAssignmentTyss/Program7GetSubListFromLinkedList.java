package collectionAssignmentTyss;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Program7GetSubListFromLinkedList {

	public static void main(String[] args) {
		LinkedList<String> Linkedlist = new LinkedList<String>();
		Linkedlist.add("poonam");
		Linkedlist.add("sharma");
		Linkedlist.add("gauri");
		Linkedlist.add("patel");
		Linkedlist.add("savitha");
		Linkedlist.add("shwata");
		System.out.println("Original LinkedList Element"+Linkedlist);
		Iterator Iterator = Linkedlist.iterator();
		while (Iterator.hasNext()) {
			System.out.println(Iterator);
			
		}
		 // Obtaining Sublist from the LinkedList
		//List sublist = linkedlist.subList(2,5);
		List sublist = Linkedlist.subList(2, 5);
		// Displaying SubList elements
		System.out.println("\nSub List elements:");
	    Iterator subit= sublist.iterator();
	    while(subit.hasNext()){
	       System.out.println(subit.next());
	    }
	}

}
