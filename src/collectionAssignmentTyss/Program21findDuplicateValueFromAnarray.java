package collectionAssignmentTyss;

import java.util.TreeSet;

public class Program21findDuplicateValueFromAnarray {

	public static void main(String[] args) {
		 String[] strArr = {"A","B","A","B","D","E"};
	        TreeSet<String> unique = new TreeSet<String>();
	        for(String str:strArr){
	            if(!unique.add(str)){
	                System.out.println("Duplicate Entry is: "+str);
	            }
	        }
		
	}

}
