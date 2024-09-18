//overriding only achieved with only inheritance 
//overloading can achieve with inheritance or without inheritance 
class ABC  
{
    void m1(int a)
    {
        System.out.println(a);
    }
    void m2(int b)
    {
        System.out.println(b);
    }
}
class XYZ extends ABC 
{
    //whatever method we are created in the parent class 
    //same we are created in child class this is overiding 
    void m1(int a)
    {
        System.out.println(a*a);
    }
    //m2 method is overloaded in the child class 
    //in overloading we are changing declaration 
    void m2(int a,int b)
    {
        System.out.println(a+b);
    }
}
public class Over 
{
	public static void main(String[] args) 
	{
		XYZ xy=new XYZ();
		xy.m1(10);
		xy.m2(20);//it calls m2 of ABC 
		xy.m2(10,20);
		
		
	}
}
