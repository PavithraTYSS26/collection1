package collectionAssignmentTyss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Programs4ShuffleElementInArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("poonam");
		list.add("gauri");
		list.add("savitha");
		list.add("shwata");
		list.add("girish");
		list.add("Divya");
		System.out.println("orignal list "+list);
		Collections.shuffle(list);		
		System.out.println("result after suffle "+list);
		for (String str : list) {
			System.out.println(str);
			
		}
		Collections.shuffle(list);
	
		System.out.println("result after suffle "+list);
		for (String str : list) {
			System.out.println(str);
			
		}

		
	}

}
