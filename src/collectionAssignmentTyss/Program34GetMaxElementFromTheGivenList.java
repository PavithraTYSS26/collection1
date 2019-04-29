package collectionAssignmentTyss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program34GetMaxElementFromTheGivenList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
        list.add(200);
        list.add(100);
        list.add(50);
        list.add(500);
        list.add(2);
        list.add(90);
        System.out.println("Maximum element from the list: "+Collections.max(list));

	}

}
