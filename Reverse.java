import java.util.*;
public class Reverse
{
	public static void main(String[] args) {
	    //example1
	    //reverse of string
	    //method1
		String s="welcome";
		for(int i=s.length()-1;i>=0;i--)
		{
		    System.out.println(s.charAt(i));
		}
		//method2
		char a[]=s.toCharArray();//this method converts characters to array
		for(int i=a.length-1;i>=0;i--)
		{
		    System.out.println(a[i]);
		}
		//method3
		/*StringBuffer s= new StringBuffer("welcome");
		System.out.println(s.reverse());*/
		
	}
}
