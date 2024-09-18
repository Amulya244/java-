
public class Greetings
{
    //no parameter no return value
    void m1()//to access this method we need to create object in main method 
    {
        System.out.println("hello world");
    }
    //no parameters but return value
    String m2()
    {
        return "hello";
    }
    //takes parameter but no return value 
    void m3(String name)
    {
        System.out.println("hello java");
    }
    //takes parameter and returns value 
    String m4(String name)
    {
        return "hello "+ name;
    }
	public static void main(String[] args) {
		Greetings gr=new Greetings();//object creation
		gr.m1();//through the object we invoke methods
		String q=gr.m2();//to hold return value we created a variable
	    System.out.println(q);
	    gr.m3("kilash");
	    String r=gr.m4("akash");
	    System.out.println(r);
	}
}
