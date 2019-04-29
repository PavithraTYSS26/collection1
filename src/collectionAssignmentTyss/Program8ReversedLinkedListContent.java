package collectionAssignmentTyss;

import java.util.Collections;
import java.util.LinkedList;

public class Program8ReversedLinkedListContent {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("gowri");
		list.add("savitha");
		list.add("poonam");
		list.add("sweetha");
		list.add("girish");
		System.out.println("Result for before reverse: ");
		for(String strr : list) {

		System.out.println(strr);
		}

		Collections.reverse(list);
		System.out.println("Results after reverse operation:");
		for(String str:list) {
		System.out.println(str);
				}
	}

}
