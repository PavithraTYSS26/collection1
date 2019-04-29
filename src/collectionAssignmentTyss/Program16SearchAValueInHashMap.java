package collectionAssignmentTyss;

import java.util.HashMap;

public class Program16SearchAValueInHashMap {

	public static void main(String[] args) {
		 HashMap<String, String> hm = new HashMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("mumbai", "mumbai INSERTED");	        
	        hm.put("kolkata", "kolkata INSERTED");
	        hm.put("chennai","chennai INSERTED");
	        
	        System.out.println(hm);
	        if(hm.containsValue("mumbai INSERTED")){
	            System.out.println("The hashmap contains value mumbai INSERTED");
	        } else {
	            System.out.println("The hashmap does not contains value mumbai INSERTED");
	        }
	        if(hm.containsValue("Mumbai INSERTED")){
	            System.out.println("The hashmap contains value mumbai INSERTED");
	        } else {
	            System.out.println("The hashmap does not contains value mumbai INSERTED");
	        }
	        
	        if(hm.containsValue("poonam")){
	            System.out.println("The hashmap contains value poonam");
	        } else {
	            System.out.println("The hashmap does not contains value poonam");
	        }
		

	}

}
