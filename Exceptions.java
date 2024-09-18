//checked exceptions 
public class Exceptions
{
	public static void main(String[] args) throws InterruptedException{
		System.out.println("program started");
		System.out.println("program in progress");
		//after this i want pass my code for some time 
		//for this thread method is used 
		
		Thread.sleep(5000);
		//it will pass for 5secs 
		//it will show interupted exception 
		//we can write this in try block 
		/*try 
		{
		    Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
		    
		}*/
		System.out.println("program finished");
		System.out.println("program exited");
	}
}
