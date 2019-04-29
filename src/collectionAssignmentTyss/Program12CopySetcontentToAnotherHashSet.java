package collectionAssignmentTyss;

import java.util.HashSet;

public class Program12CopySetcontentToAnotherHashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("mumbai");
        hs.add("pune");
        hs.add("lucknow");
        hs.add("manipur");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("test1");
        subSet.add("test2");
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
		
	}

}
