package collectionAssignmentTyss;

import java.util.ArrayList;

public class Program1CloneArrayList {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("poonam");
		arraylist.add("gauri");
		arraylist.add("savitha");
		arraylist.add("shwata");
		System.out.println("Actual ArrayList"+ arraylist);
		ArrayList<String> copy = (ArrayList<String>)arraylist.clone();
		System.out.println("cloned ArrayList"+copy);
		
		
	}

}
