package collectionAssignmentTyss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program5SwapTwoElementInArrayLIst {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>(Arrays.asList("gowri", "poonam", "savitha", "sweetha", "girish", "divya"));
         
	        System.out.println(list);
	         
	        Collections.swap(list, 1, 2);
	         
	        System.out.println(list);
	    
	}

}
