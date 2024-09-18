
public class Overloading 
{
    void main(int x)
    {
        System.out.println(x);
    }
    void main(String s)
    {
        System.out.println(s);
    }
    void main(String s1, String s2)
    {
        System.out.println(s1+s2);
    }
    //we can also overload main method 
    //here we created many main methods 
    //to access this main methods we need to access from object 
    //that object is created in public static void main 
	public static void main(String[] args)
	//this main method takes arguments it acts as command prompt 
	//args is just a variable
	{
		Overloading ov=new Overloading();
		ov.main(10);
		ov.main("hi");
		ov.main("hello","world");
	}
}
