package collectionAssignmentTyss;

import java.util.concurrent.SynchronousQueue;

public class Swapping {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swapping");
		System.out.println("a"+a);
		System.out.println("b"+b);
		swap(a,b);
		
		
}
	

public static void swap(int a,int b)
{
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("After swapping");
	System.out.println("a"+a);
	System.out.println("b"+b);
}
}