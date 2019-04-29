package collectionAssignmentTyss;

import java.util.Iterator;
import java.util.LinkedList;

public class Program11IterateThroughLinkedListInReversedOrder {

	public static void main(String[] args) {
		{
	         
	        LinkedList<String> arrl = new LinkedList<String>();
	        arrl.add("poonam");
	        arrl.add("gauri");
	        arrl.add("shwata");
	        arrl.add("savitha");
	        System.out.println("output befere reversion"+arrl);
	        System.out.println("output after reversed order");
	         Iterator itr = arrl.descendingIterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	    }

	}

}
