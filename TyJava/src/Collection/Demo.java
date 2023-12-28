package Collection;

import java.util.ArrayList;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList a1= new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(38);
		a1.add(true);
		a1.add('A');
		System.out.println(a1);
		Iterator i=a1.iterator();
		while(i.hasNext());
		{
			System.out.println(i.next());
		}
	}

}
