class Dog extends Super 
{
    String color="black";
    void displayColor()
    {
        System.out.println(super.color);
        //super keyword invoke parent class variable instead of latest value 
    }
    void eat()
    {
        System.out.println("eating bread");
        super.eat();
    }
}

public class Super
{
    String color="white";
    
    void eat()
    {
        System.out.println("eating");
    }
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.displayColor();//if we call this method we are getting
		//update value of color but i want parent class value 
		//i want to display white color with child object only
		//this is possible using super keyword 
		//super keyword first it will show the parent class value 
		d.eat();//i want old implimentation that is parent method 
		//for that we can use super keyword 
	}
}
