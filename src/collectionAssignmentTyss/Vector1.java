package collectionAssignmentTyss;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v);//o/p[]
		System.out.println(v.capacity());//10 by default
		for(int i=1;i<10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
