
public class Casting
{
	public static void main(String[] args) {
		/*Object o=new String("welcome");
		StringBuffer sb=(StringBuffer) o;*/
		//rule 3 failed beacuse there is no relationship between
		//string and stringbuffer 
		
		//ex2
		/*String s=new String("welcome");
		StringBuffer sb=(StringBuffer) s;*///rule 1 failed
		
		//ex3
		
		/*object o=new String("Welcome");
		StringBuffer sb=(StringBuffer) o;*/
		//Stringbuffer is derived from object so there is relationship 
		//rule 1 is valid 
		//StringBuffer and StringBuffer both are same so rule 2 valid 
		//rule 3 failed 
		//because there is no relationship between string and stringbuffer 
		
		//ex4
		/*Object o =new String("welcome");
		StringBuffer sb=(String) o;*/
		//rule 1 passed because there is a relationship between string and object 
		//rule 2 failed String and Stringbuffer different 
		
		//ex5
		Object o=new String("welcome");
		StringBuffer sb=(StringBuffer) o;
		//rule1 pass rule 2 pass 
		//rule 3 failed 
		
		//ex6
		Object o=new String("welcome");
		String s=(String) o;
		//rule 1 rule 2 rule 3 passed 
		System.out.println(s);
	}
}
