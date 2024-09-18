import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//declaration 
		//HashMap hp=new HashMap();
		HashMap<Integer,String>hp=new HashMap<Integer,String>();
		//integer or keys string are values
		
		//adding pairs 
		hp.put(101,"jhon");
		hp.put(102,"scoot");
		hp.put(103,"mary");
		hp.put(104,"david");
		System.out.println(hp);
		
		//remove one pair 
		//we can not remove one key or value saparetly 
		hp.remove(103);//103 key pair 
		System.out.println("After removing pair:"+hp);
		
		//access values of the key 
		System.out.println(hp.get(102));
		
		//get all the keys from HashMap
		System.out.println(hp.keySet());//keys 
		System.out.println(hp.values());
		
		//reading data from hashmap 
		//using for each loop 
		for(int x:hp.keySet())
		{
		    System.out.println(x+" "+hp.get(x));
		}
		
		//using iterator 
		/*Iterator<Entry<Integer,String>> it=hp.entrySet().iterator();
		while(it.hasNext())
		{
		    Entry<Integer,String> entry=it.next();
		    System.out.println(entry.getKey()+ " "+entry.getValue());
		}*/
		
		hp.clear();
		System.out.println(hp.isEmpty());
	}
} 
