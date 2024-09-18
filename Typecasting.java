//upcasting 
//converting lower to higher 
//it is automatic process 
//int to long 
//low casting 
//converting higher to lower 
//it is manual process 
//long to int 
public class Typecasting
{
	public static void main(String[] args) {
		int intvalue=100;
		long longvalue=intvalue;
		//long can hold int value because long has more meory than int 
		System.out.println(longvalue);
		//downcasting 
		//we have to reduce large value to small value then it can store 
		
		double doublevalue=10.5F;
		float floatvalue=(float)doublevalue;
		System.out.println(floatvalue);
	}
}
