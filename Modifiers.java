
public class Modifiers
{
    /*private int x=100;
    //as we kept private 
    //it will show eroor we can not access private variables ar methods
    //in different class we can access only with in the class 
    private void m1()
    {
        System.out.println("this is m1 ");
    }
    */
    //let us make this as default 
    //default accesed with in package 
    /*int x=100;
    void m1()
    {
        System.out.println("this is m1");
    }*/
    //let us make this protrected 
    //to access this we need it as parent class and another class 
    //as child class 
    /*protected int x=100;
    protected void m1()
    {
        System.out.println("this is m1");
    }*/
    //let us make it public 
    //without any changes we can access from any package 
    public int x=100;
    public void m1()
    {
        System.out.println("this is m1");
    }
    
}
