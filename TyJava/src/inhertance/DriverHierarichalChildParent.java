package inhertance;

public class DriverHierarichalChildParent {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarichalInterfaceChild1 c1=new HierarichalInterfaceChild1();
		 System.out.println(c1.a);
		 System.out.println(c1.b);
		 //System.out.println(c1.c);
		 
		 HierarichalInterfaceChild2 c2=new HierarichalInterfaceChild2();
		 System.out.println(c2.a);        
		 System.out.println(c2.b);
		 System.out.println(c2.c);
		 
		 HierarichalInterface h1=new HierarichalInterface();
		 System.out.println(h1.a);
		// System.out.println(h1.b);
		// System.out.println(h1.c);

	}

}

