class Parent 
{
    String name="Jhon";
    void m1()
    {
        System.out.println("this is m1 from parent");
    }
}
class Child extends Parent 
{
    int id=101;
    void m2()
    {
        System.out.println("this is m2 from child ");
    }
}
public class Upcasting 
{
	public static void main(String[] args) {
	    //this is one method 
        /*Child c=new Child();
        System.out.println(c.name);//parent 
        c.m1();//parent 
        System.out.println(c.id);//child 
        c.m2();//child */
        //Parent p=new Child();//parent class reference variable can hold child class objecct 
        //we are storing lower object in higher object it is upcasting 
        //we can access parent but not child 
        //System.out.println(p.name);//parent 
        //p.m1();//parent 
        //System.out.println(p.id);//child //not possible 
        //p.m2();//not possible 
        
        
        //for down casting 
        //explisitily we need to specify variable 
        
	}
}
