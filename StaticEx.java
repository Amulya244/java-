
public class StaticEx  
{
    static int a=10;//static variable 
    int b=20;//non static variable 
    //static variables and methods we can directly access there is no object required 
    static void m1()//it is static method 
    {
        System.out.println("this is m1 static method");
        
    }
    void m2()//non static method 
    {
        System.out.println("this is m2 static method");
    }
    void m()//non static method 
    {
        //static methods and variables can accessed directly by non static methods 
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
	public static void main(String[] args)
	//main method is static method 
	{
		System.out.println(a);
		//System.out.println(b);//non static we can call directly 
		m1();
		//m2();//non static we can not access directly;
		StaticEx st=new StaticEx();
		st.m();
		st.m2();
		
	}
}
