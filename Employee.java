
import java.util.*;
public class Employee 
{
    //variables
    int eid;
	String ename;
	String job;
	int sal;
	//methods
	//we can not create method inside method 
	void display()//it is just a normal method 
	{
	    //if we create inside this method that are local variables 
	    //we can only access with in this method 
	    System.out.println(eid);
	    System.out.println(ename);
	    System.out.println(job);
	    System.out.println(sal);
	}
	//main method 
	public static void main(String[] args) {
		Employee emp1=new Employee();//object 
		emp1.eid=101;
		emp1.ename="jhon";
		emp1.job="hr";
		emp1.sal=4000;
		emp1.display();
		Employee emp2=new Employee();//object 
		emp1.eid=102;
		emp1.ename="kitty";
		emp1.job="staff";
		emp1.sal=1000;
		emp1.display();
	}//we can access main method from same package
	//import is used to access from different package 
}
