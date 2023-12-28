package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class WorkingWithQueue {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30.5);
		l.add(true);
		l.add("hello");
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.peek());
		
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next() );
		}
	
		
		
	}

}
