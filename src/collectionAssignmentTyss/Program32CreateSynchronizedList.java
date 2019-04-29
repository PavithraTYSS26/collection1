package collectionAssignmentTyss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Collections.synchronizedList() method helps to get thread safe list.
//Collections.synchronizedList() method Returns a synchronized (thread-safe) list backed by the specified list.

public class Program32CreateSynchronizedList {

	public static void main(String[] args) {
		 List<String> li = new ArrayList<String>();
	        List<String> sysLi = Collections.synchronizedList(li);
	        System.out.println("Synchronized list got created...");

	}

}
