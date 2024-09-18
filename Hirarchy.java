//hirarchy inheritance 
class A 
{
    //class a has only data of class a 
    //beacuse it is parent class 
    void display(int a)
    {
        System.out.println(a);
    }
}
class B extends A
{
    //class b has varibles and methods of itself and class a no connection with class c 
    void show(int b)
    {
        System.out.println(b);
    }
}
class C extends A 
{
    //class c has variables and methods of itself and class a no connection with class b 
    void print(int c)
    {
        System.out.println(c);
    }
}
public class Hirarchy 
{
    
	public static void main(String[] args)
	{
		A obj1=new A();
		obj1.display(10);//it is class a 
		
		B obj2=new B();
		obj2.display(20);//it is class a 
		obj2.show(30);//it is class b
	
		C obj3=new C();
		obj3.display(40);//it is class a 
		obj3.print(50);//it is class c
	}
}
