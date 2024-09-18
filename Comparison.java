import java.util.*;
public class Comparison 
{
	public static void main(String[] args) {
		//string comparison 
		//method1
		/*
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);//case1
		System.out.println(s1.equals(s2));//case2
		*/
		//method2 
		/*
		String s1=new String("welcome");//s1 and s2 creates two different objects
		String s2=new String("welcome");
		System.out.println(s1==s2);//case1 //== compares the objects
		System.out.println(s1.equals(s2));//case2 //equals compare value of objects
		*/
		//method3
		/*
		String s1=("welcome");
		String s2=new String("welcome");//creates new object
		System.out.println(s1==s2);//objects are not matched
		System.out.println(s1.equals(s2));//values are same so true 
		*/
		//method 4
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		System.out.println(s1==s3);//s3 also refering to same object so returns false
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);//s3 alse refering same object so returns true
	}
}
