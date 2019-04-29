package collectionAssignmentTyss;

import java.util.HashMap;
import java.util.Set;

public class Program17GetAllKeysFromHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("mumbai", "mumbai INSERTED");	        
        hm.put("kolkata", "kolkata INSERTED");
        hm.put("chennai","chennai INSERTED");        
        System.out.println(hm);
         Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println(key);
		
	}

}
}
