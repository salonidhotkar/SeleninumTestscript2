package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class WorkingWithPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PriorityQueue p=new PriorityQueue();
       p.add(10);
       p.offer(20);
       p.offer(2);
       p.add(4);
       p.add(49);
       System.out.println(p);
       
       Iterator i=p.iterator();
       while(i.hasNext());
       {
    	   System.out.println(i.next());
       }
      
       while(!p.isEmpty())
       {
    	   System.out.println(p.poll());
       }
	}

}
