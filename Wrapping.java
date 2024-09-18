
public class Wrapping 
{
	public static void main(String[] args) {
		String s1="10.5";
		String s2="20.5";
		//numbers are decimals but they are in string 
		//so this need to convert to double 
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		//convert to boolean
		String s="hi";
		//other than true if pass any string it will diplay false
		System.out.println(Boolean.parseBoolean(s));
		
	}
}
