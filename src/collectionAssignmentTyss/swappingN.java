package collectionAssignmentTyss;

public class swappingN {

	public static void main(String[] args) {
		int num=1024;
		int temp=num;
		int rev=0;
		while(temp>0)
		{
			int d=temp%10;
			rev=rev*10+d;
			temp=temp/10;
		}
		System.out.println(rev);

	}

}
