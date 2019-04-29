package collectionAssignmentTyss;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("c");
		s.push("D");
		System.out.println(s);
		System.out.println(s.search("B"));
	}

}
