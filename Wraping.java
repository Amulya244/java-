
public class Wraping
{
    
	public static void main(String[] args) 
	{
		//String to int 
		//this we can not convert to int 
		//characters can not be converted to nummeric 
		/*String s="welcome";
		int sint=Integer.parseInt(s);*/
		String s1="10";
		String s2="20";
		//if perform s1+s2 the output will be 1020 
		//because it is concatinating 
		//to perform addition it need to be converted to integer 
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	}
}
