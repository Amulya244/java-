import java.util.*;
public class Mutable 
{
	public static void main(String[] args) {
		int a[]={2,4,6,3,1};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//mutable beacuse original array is changing
		System.out.println(Arrays.toString(a));
		//string immutable
		String s=new String("welcome");
		s.concat("to java");//imutable it cannot change 
		System.out.println(s);
		
		//string buffer mutable string builder mutable 
		StringBuffer t=new StringBuffer("wellcome");
		t.append("to java");
		System.out.println(t);//we can change original value of t 
		StringBuilder u=new StringBuilder("welllcome");
		u.append("to java");
		System.out.println(u);//we can change original value of u
		
	}
}
