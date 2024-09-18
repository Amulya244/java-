
public class Student 
{
    //global varibles 
    int sid;
    String sname;
    char grad;
    
    void printData()
    {
        System.out.println(sid+ " "+sname+" "+grad);
    }
    void setStudentData(int id, String name, char gr)//this are local variables
    {
        sid=id;
        sname=name;
        grad=gr;
    }
    Student(int id, String name, char gr)//parameterized constructer
    {
        sid=id;
        sname=name;
        grad=gr;
        //we should not write any logic here 
    }
	public static void main(String[] args) {
		//Student stu=new Student();
		//using object reference variables we can store data
		/*stu.sid=100;
		stu.sname="jhon";
		stu.grad='A';
		stu.printData();*/
		//second approach 
		//by creating one more method we accesed the data 
		/*stu.setStudentData(101,"kalki",'B');
		stu.printData();*/
		//third approach
		//by using constuctor we can store data 
		//constructer name should be like clas name 
		//the method may or may not return any value
		//constructer will not return any value so we do  not specify void 
		//but constructer maytake parameters
		//constructer is just for initializing variables nothing we can not perform inside constructer 
		//we should not call constructer 
		//at the time of object creation constructer is automatically invoked 
        //inside paranthesis we should pass parameters 
        Student stu=new Student(101,"jhon",'C');
        stu.printData();
        //if we want to just assign the data to variables we prefer constructer 
        //if we want to perform some logic or operations we prefer method 
	}
}
