package collectionAssignmentTyss;

import java.util.HashSet;

public class Program13HowToCompareTwoSetsAndRetainElementsWhichAreSameOnBothSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("gowri");
        hs.add("savitha");
        hs.add("sweetha");
        hs.add("poonam");
        hs.add("Apple");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("Apple");
        subSet.add("savitha");
        subSet.add("poonam");
        hs.retainAll(subSet);
        System.out.println("HashSet content:");
        System.out.println(hs);

	}

}
