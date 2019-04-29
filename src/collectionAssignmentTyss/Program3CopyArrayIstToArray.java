package collectionAssignmentTyss;

import java.util.ArrayList;

public class Program3CopyArrayIstToArray {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("poonam");
		arraylist.add("gauri");
		arraylist.add("savitha");
		arraylist.add("shwata");
		System.out.println("Actual ArrayList"+ arraylist);
		String[] StringArrayList = new String[arraylist.size()];
		arraylist.toArray(StringArrayList);
		System.out.println("Created Array content");
		for(String str:StringArrayList){
            System.out.println(str);
        }
		

	}

}
