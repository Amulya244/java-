
public class Exceptions 
{
	public static void main(String[] args) {
		String s="123";//excute
		//String s="welcome";//NumberFormatException
		//we try to convert string to integer using wrapper classes 
		int a=Integer.parseInt(s);
		System.out.println(a);
		//if we provide number in string program will excute without 
		//any exception 
		//if we provide letters it will show exception 
		//this exception is number format exception 
		
		//example2
		String h=null;//nullpointer exception
			System.out.println(h.length());
	}
}
