
public class ThisKeyword
{
    int x,y; //class variables/instance variables 
    ThisKeyword(int x,int y)
    {
        this.x=x;//this refers to class variables 
        //we can use different variable name or we can use this keyword 
        this.y=y;//local variables 
        //local variables used only inside method 
        //in java we dont have global variables 
        //global variables are created out of class 
        //here we created inside class that are class variables 
    }
    
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
	public static void main(String[] args) {
		ThisKeyword th=new ThisKeyword(10,20);
		th.display();
	}
}
