import java.util.*;
public class Exceptions 
{
	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter position(0-4):");
		int pos=scan.nextInt();
		System.out.println("enter a value:");
		int value=scan.nextInt();
		a[pos]=value;//this will insert value 
		//in the array exactly at that position 
		System.out.println(a[pos]);
		//at run time when we give array position is 5 
		//it will show error 
		//because we can provide postions from 0to4 
		//other than that it will show exception 
		//it is arrayindex out of box exception 
	}
}
