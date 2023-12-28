package Collection;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList a1=new ArrayList();
   a1.add(10);
   a1.add(22.22);
   a1.add(70);
   a1.add(true);
   
   System.out.println(a1.contains(10));
   System.out.println(a1.contains(true));
   System.out.println(a1.contains(false));
	}

}
