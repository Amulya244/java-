//final keyword 
class Test 
{
    final int x=100;
}
public class Final
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		//t.x=200;//we are modifying the value 
		//after we final to the variable we can not change the value 
		System.out.println(t.x);
	}
}
