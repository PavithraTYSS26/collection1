package collectionAssignmentTyss;

import java.util.TreeMap;

public class Program23CopyMapContentToAnotherTreeMap {

	public static void main(String[] args) {
		
	        TreeMap<String, String> hm = new TreeMap<String, String>();
	        //add key-value pair to TreeMap
	        hm.put("mumbai", "FIRST INSERTED");
	        hm.put("lucknow", "SECOND INSERTED");
	        hm.put("Delhi","THIRD INSERTED");
	        hm.put("bangalore", "Fouth INSERTED");
	        System.out.println(hm);
	        TreeMap<String, String> subMap = new TreeMap<String, String>();
	        subMap.put("s1", "S1 VALUE");
	        subMap.put("s2", "S2 VALUE");
	        subMap.put("s3", "S3 VALUE");
	        hm.putAll(subMap);
	        System.out.println(hm);
	    }
	}


