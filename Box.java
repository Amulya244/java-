//method overloading or constructor overloading 
//overloading is related to polymorphism 
public class Box
{
    double width, height, depth;
    //constructer without parameter 
    Box()//no parameters
    {
        /*width=0;
        height=0;
        depth=0*/
        width=height=depth=0;
    }
    Box(double w, double h,double d)//three parameters 
    {
        width=w;
        height=h;
        depth=d;
    }
    Box(double len)//one parameter 
    {
        width=height=depth=len;
    }
    //below method is not constructer method 
    double volume()//this method is to perform some task 
    {
        return (width*height*depth);
    }
	public static void main(String[] args) {
		//Box b=new Box();//it invokes first constructer 
		//at a time we can call only one constructer 
		//Box b=new Box(1.2,3.4,5.4);//it will invoke second constructer 
		Box b=new Box(3.9);//it will invoke third constructer 
		System.out.println(b.volume());//b.volume calls volume method 
	}
}
