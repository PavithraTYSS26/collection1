package collectionAssignmentTyss;

import java.util.TreeMap;

public class Program25SearchAValueInTreeMap {

	public static void main(String[] args) {
		 TreeMap<String, String> hm = new TreeMap<String, String>();         
	        
	        hm.put("poonam","poonam INSERTED");
	        hm.put("gauri", "gauri INSERTED");
	        hm.put("savitha","savitha INSERTED");
	        System.out.println(hm);
	        if(hm.containsValue("poonam INSERTED")){
	            System.out.println("The TreeMap contains value poonam");
	        } else {
	            System.out.println("The TreeMap does not contains value poonam");
	        }
	        if(hm.containsValue("gauri INSERTED")){
	            System.out.println("The TreeMap contains value gauri");
	        } else {
	            System.out.println("The TreeMap does not contains value gauri");
	        }
	        if(hm.containsValue("savitha INSERTED")){
	            System.out.println("The TreeMap contains value savitha");
	        } else {
	            System.out.println("The TreeMap does not contains value savitha");
	        }
	        if(hm.containsValue("Savitha INSERTED")){
	            System.out.println("The TreeMap contains value savitha");
	        } else {
	            System.out.println("The TreeMap does not contains value savitha");
	        }
		

		  
	}

}
