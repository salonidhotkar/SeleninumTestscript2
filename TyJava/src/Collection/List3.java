package Collection;

import java.util.ArrayList;

public class List3 {
	public static void main(String[] args) {
		
		 ArrayList a1=new ArrayList<>();
		 a1.add(10);
		 a1.add(20);
		 a1.add(30);
		 a1.add(20);
		 a1.add(50);
		 
		 System.out.println(a1);
		 System.out.println(a1.indexOf(10));
		 System.out.println(a1.indexOf(20));
		 System.out.println(a1.lastIndexOf(20));
		 System.out.println(a1.set(4,"hello"));
		 System.out.println(a1);
		 
		 for(Object o:a1)
		 {
			 System.out.print(o);
		 }
		 }

}
