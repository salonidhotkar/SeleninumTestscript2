package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class WorkingWithTree {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(20);
		t.add(70);
		t.add(60);
		System.out.println(t);
		System.out.println("printing the element in ascending order");
		Iterator i1=t.iterator();
		while(i1.hasNext())
		{
		  System.out.println(i1.next());	
		}
		
		System.out.println("printing the element in desending order");
		Iterator i=t.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
