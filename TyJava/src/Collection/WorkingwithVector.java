package Collection;

import java.util.ListIterator;
import java.util.Vector;

public class WorkingwithVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Vector v1=new Vector();
		v1.add(10);
		v1.add(21);
		v1.addElement("renuka");
		v1.add("hello");
		v1.add(false);
		System.out.println(v1);
		
		for(Object o:v1)
		{
			System.out.println(o);
		}
		
		System.out.println("-------------------------");
		
		 ListIterator i=v1.listIterator(v1.size());
		   while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	}

}
