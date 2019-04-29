package collectionAssignmentTyss;

import java.util.TreeMap;

public class Program24SearchAKeyInTreeMap {

	public static void main(String[] args) {
		  TreeMap<String, String> hm = new TreeMap<String, String>();         
	        
	        hm.put("poonam","poonam INSERTED");
	        hm.put("gauri", "gauri INSERTED");
	        hm.put("savitha","savitha INSERTED");
	        System.out.println(hm);
	        if(hm.containsKey("poonam")){
	            System.out.println("The TreeMap contains key poonam");
	        } else {
	            System.out.println("The TreeMap does not contains key poonam");
	        }
	        if(hm.containsKey("gauri")){
	            System.out.println("The TreeMap contains key gauri");
	        } else {
	            System.out.println("The TreeMap does not contains key gauri");
	        }
	        if(hm.containsKey("savitha")){
	            System.out.println("The TreeMap contains key savitha");
	        } else {
	            System.out.println("The TreeMap does not contains key savitha");
	        }
	        if(hm.containsKey("Savitha")){
	            System.out.println("The TreeMap contains key savitha");
	        } else {
	            System.out.println("The TreeMap does not contains key savitha");
	        }
		

	}

}
