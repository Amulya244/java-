//final class Test1
//here if we use final keyword for class 
class Test1
{
    //final void m()
    //here if we used final keyword for method 
    void m()
    {
        System.out.println("this is m method");
    }
}
//it will not allow any child class to create it will show error 

class Test2 extends Test1
{
    void m()
    //we can not overide parent method it will show error 
    //we can overload if we use final keyword but we can not overide 
    {
        System.out.println("this new m method");
    }
}
public class Final 
{
	public static void main(String[] args) 
	{
		Test2 ts=new Test2();
		ts.m();
	}
}
