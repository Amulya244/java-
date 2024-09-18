
public class Exphandling
{
	public static void main(String[] args) {
		System.out.println("program is started");
		String s=null;
		
		try
		{
		    System.out.println(s.length());
		}
		/*catch(ArithmeticException e)
		{
		    System.out.println("handled exception");
		    System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
		    System.out.println("handled exception");
		    System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
		    System.out.println("handled exception");
		    System.out.println(e.getMessage());
		}*/
		//if we get exceptions other than this again need to specify 
		//new catch block 
		//there is one alternative for this 
		//Exception is super class for all above exceptions 
		//below catch block can handle any type of exception 
		catch(Exception e)
		{
		    System.out.println("handled exception");
		    System.out.println(e.getMessage());
		}
		//getmessage will get the information 
		//reason for exception 
		System.out.println("program is finished ");
		
	}
}
