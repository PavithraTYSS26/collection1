package collectionAssignmentTyss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Program33createSynchronizedMap {

	public static void main(String[] args) {
		//first create map
		
	      Map<String,String> map = new HashMap<String,String>();	      
	      map.put("1","poonam"); 
	      map.put("2","gauri");
	      map.put("3","savitha");	    
	      Map<String,String> synmap = Collections.synchronizedMap(map);
	      System.out.println("Synchronized map is :"+synmap);
		

	}

}
