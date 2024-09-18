//we can not write two public class or interface in one file 
//so we created different files 
public class Abstraction implements I1, I2
{
    public void m1()
    {
        System.out.println(x);
    }
    public void m2()
    {
        System.out.println(y);
    }
	public static void main(String[] args)
	{
		Abstraction ob=new Abstraction();
		ob.m1();
		ob.m2();
	}
}
