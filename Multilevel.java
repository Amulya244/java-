//multi level inheritance 
class A 
{
    int a;
    void display()
    {
        System.out.println(a);
    }
}
class B extends A
{
    int b;
    void show()
    {
        System.out.println(b);
    }
}
class C extends B 
{
    //there are three variables in class c 
    //if we create object for c we can access a b and c 
    //c is grand child 
    int c;
    void print()
    {
        System.out.println(c);
    }
}
public class Multilevel
{
    
	public static void main(String[] args) 
	{
		C obj=new C();
		//in main method we are assigning values 
		obj.a=100;
		obj.b=200;
		obj.c=300;
		
		obj.display();
		obj.print();
		obj.show();
	}
}
