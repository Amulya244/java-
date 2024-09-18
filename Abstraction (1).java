interface Shape
{
    int length=10;//bydeafult it is final and static variable 
    int breadth=20;
    /*void square()
    {
        //implimented methods are not allowed 
    }*/
    default void square()//default methods are allowed 
    {
        System.out.println("this is square");
    }
    static void rectangle()//static methods are allowed 
    {
        System.out.println("this is rectangle");
    }
    void circle();//abstract methods are allowed 
}

public class Abstraction implements Shape
{
    //void circle()//here we need to impliment in child class 
    //if we dont specify any access modifier so it will allocate 
    //default access modifier 
    //but in parent interface it was public but here it is deafult 
    //public is higher modifier default is lower modifier 
    //we can not reduce the access 
    //so we specify public keyword 
    public void circle()
    {
        System.out.println("this is circle");
    }
	public static void main(String[] args) 
	{
	    //scenario 1 
		/*Main obj=new Main();
		obj.circle();
		obj.square();
		//static methods we can call directly with out using of object 
        //rectangle();//this method is not directly created in this class 
        //this is created in shape interface 
        //static method can directly access from interface 
        Shape.rectangle();
        */
        //scenario 2 
       // Shape sh=new Shape();//we can not create object for interface 
        Shape sh=new Abstraction();//we can create object for class 
        //reference variable is interface variable 
        //class object refers to the interface 
        sh.circle();//abstract method we can access from object 
        sh.square();//default method we can access from object 
        Shape.rectangle();//static method we can access from interface name 
	}
}
