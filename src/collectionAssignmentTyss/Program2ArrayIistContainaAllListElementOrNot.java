package collectionAssignmentTyss;

import java.util.ArrayList;
import java.util.List;

public class Program2ArrayIistContainaAllListElementOrNot {

	public static void main(String[] args) {
		 ArrayList<String> arrl = new ArrayList<String>();
	        arrl.add("nidhi");
	        arrl.add("yukthi");
	        arrl.add("harshu");
	        arrl.add("ruthu");
	        List<String> list = new ArrayList<String>();
	        list.add("ruthu");
	        list.add("nidhi");
	        System.out.println(list);
	        System.out.println(arrl);
	        System.out.println("Does ArrayList contains all list elements?: "
	                    +arrl.containsAll(list));
	        list.add("bharath");
	        
	        System.out.println("Does ArrayList contains all list elements?: "
	                    +arrl.containsAll(list));
	    
		

	}

}
