import java.util.*;
public class Exceptions
{
	public static void main(String[] args) {
			System.out.println("program is started");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number:");
		    int num=sc.nextInt();
		    //if user provided zero as input 
		    //this is an exception below lines will not excute 
		    //it is arthmetic exception 
		    //code will excute properly by providing number 
		    //other than zero 
			//System.out.println(100/num);
			//exception handling 
			//we can handle exception by try and catch block 
			try 
			{
			    System.out.println(100/num);
			}
			//if exception comes then only catch block will excute
			catch(ArithmeticException e)
			//catch block handles the exception 
			{
			    System.out.println("invalid data");
			}
			System.out.println("program is completed");
			System.out.println("program is exited");
			
	}
}
