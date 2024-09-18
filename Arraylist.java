import java.util.*;
public class Arraylist
{
	public static void main(String[] args) {
		//declaration of arraylist 
		ArrayList myList=new ArrayList();
		//Arraylist comes from java util package 
		
		//2List myList=new ArrayList();
		//list comes from java util package 
		//List is child class of arraylist 
		//child class object we can hold in parent class variable 
		//so it is correct 
		
		//3ArrayList <Integer>myList=new ArrayList<Integer>();
		//this array list can hold only integer type of data 
		
		//adding data into arraylist 
		myList.add(100);
		myList.add(10.5);
		myList.add(null);
		myList.add(null);
		myList.add(true);
		myList.add("hi");
		myList.add('A');
		myList.add(100);
		
		//size of arraylist 
		System.out.println("size of arraylist:"+myList.size());
		
		//printing arraylist 
		System.out.println("printing araylist:"+myList);
		
		//remove element from arraylist 
		myList.remove(7);//7 index of 100 
		System.out.println("print arraylist after remove:"+myList);
		
		//insert element between elements 
		//adding is different from insertion 
		//add will add at the end of list 
		//we use insertion to add in the middle 
		myList.add(2,"hello");
		System.out.println("print after insertion:"+myList);
		//at second index i want to add hello 
		//it will add hello at second position 
		//and remaining elements will move right side 
		
		//modify element means replacement 
		//set is the method to modify 
		myList.set(2,"python");
		System.out.println("print after modification:"+myList);
		
		//access specific element from araylist 
		System.out.println("specific element:"+myList.get(3));
		
		//reading all the elements from arraylist 
		//first approach using normal for loop 
		for(int i=0;i<myList.size();i++)
		{
		    System.out.println(myList.get(i));
		    //this will retrive the values one by one 
		}
		
		//second approach using for each loop 
		for(Object x:myList)
		{
		    System.out.println(x);
		    //in arraylist we use only object type of data 
		    //so we declare x as object 
		}
		
		//third approach using iterator 
		Iterator it=myList.iterator();
		//if arraylist contains only integers 
		//then we have to specify Iterator <Integer>it=myList.iterator();
		//iterator method calls iterator type of data 
		//for iterator we prefer to use while loop 
		while(it.hasNext())
		{
		    //hasNext is a method it will check next element is 
		    //present or not 
		    System.out.println(it.next());
		}
		
		//checking arraylist is empty or not 
		System.out.println("checking arraylist empty or not:"+myList.isEmpty());
	
	    //remove all the elements from array list 
	    ArrayList myList2=new ArrayList();
	    //new arraylist we have created 
	    //what elements we need to remove that we need to 
	    //add in new array list 
	    myList2.add("hello");
	    myList2.add(100);
	    myList2.add(null);
	    myList2.add('A');
	    myList.removeAll(myList2);
	    //we are removing second list elements from first list 
	    System.out.println("list after removeall:"+myList);
	    
	    //remove all the elements/clear 
	    myList.clear();
	    System.out.println("is arraylist empty:"+ myList.isEmpty());
	}
}
