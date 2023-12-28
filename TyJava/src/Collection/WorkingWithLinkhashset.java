package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class WorkingWithLinkhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		LinkedHashSet l=new LinkedHashSet();
		l.add(10);
		l.add(20);
		l.add(true);
		l.add(10);
		l.add(29.5);
		l.add(39.7);
		l.add("hello");
		System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
