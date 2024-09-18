
public class Student 
{
    int sid;
	    String sname;
	    char grade;
	    void printData()
	    {
	        System.out.println(sid+" "+sname+"  "+grade+"  ");
	    }
	public static void main(String[] args) {
	    Student stu1=new Student();
	    stu1.sid=102;
	    stu1.sname="dfg";
	    stu1.grade='k';
	    stu1.printData();
	}
}
