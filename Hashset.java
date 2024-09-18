import java.util.*;
public class Hashset
{
	public static void main(String[] args) {
		//declaration
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//above methods allow heterogenous data 
		//for homogenous we use 
		//HashSet <String>myset=new Hashset<String>();
		
        //adding elements to hash set
        myset.add(80);
        myset.add(100);
        myset.add('A');
        myset.add(10.5);
        myset.add("hello");
        System.out.println(myset);//it will remove duplicates 
        
        //remove specific element from hashset 
        myset.remove(10.5);
        System.out.println("hashset after remove:"+myset);
        //insertion is not possible 
        //beacuse in hashset elements are stored randomly 
        //so insertion not possible 
        
        //accessing specific element is not possible 
        //directly we can not access specific element 
        //but we can convert hastset to arraylist and then 
        //we can get specific element 
        ArrayList al=new ArrayList(myset);
        System.out.println(al);
        System.out.println(al.get(2));
        
        //read all the elements using for each 
        //we can not use for loop beacuse index is not there in hashset 
        for(Object x:myset)
        {
            System.out.println(x);
        }
        //using iterator 
        Iterator it=myset.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        //clearing all elements in hashset 
        myset.clear();
        System.out.println(myset.isEmpty());
        
        //size of hashset 
        System.out.println("size of hashset:"+myset.size());
	}
}
