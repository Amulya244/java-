//this are all unchecked exception 
//this are not identified by java compiler 
//we have to identify and we have to fix 
public class Trycatch
{
	public static void main(String[] args) {
		String s="helo";
		
		try 
		{
		    System.out.println(s.length());
		}
		catch(Exception e)
		{
		    System.out.println("handled exception");
		    System.out.println(e.getMessage());
		}
		//finally block always excute if exception occur or not 
		//try and catch are mandatory blocks 
		//finally block is optional 
        finally
        {
            System.out.println("finally block ");
        }
		System.out.println("program finished");
	}
}
