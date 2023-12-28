package Collection;

import java.util.ArrayList;

public class WorkingWithArraylist1 {
	
	public static void main(String[] args) {
		
	
	ArrayList a1= new ArrayList<>();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	a1.add(5);
	System.out.println(a1);
	a1.add(1,200);
	System.out.println(a1);
	a1.remove(a1.size()-1);
	System.out.println(a1);
	a1.remove(3);
	System.out.println(a1);
	
	for(Object o:a1)
	{
		System.out.println(o);
	}
	

	}
}


