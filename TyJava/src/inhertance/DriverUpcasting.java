package inhertance;

public class DriverUpcasting {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ChildUpCasting c1=new ChildUpCasting();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		
		ParentUpCasting p1=new ParentUpCasting();
		System.out.println(p1.a); 
		System.out.println(p1.b);
	//	System.out.println(p1.c);
		//System.out.println(p1.d);
		System.out.println(p1 instanceof ParentUpCasting);
		System.out.println(p1 instanceof ChildUpCasting);
		 
		p1=c1;
		
		//System.out.println(p1.c);
		//System.out.println(p1.d);
		
		
	    ChildUpCasting c3= (ChildUpCasting)p1;
	    System.out.println(p1);
	    System.out.println(c1);
	    System.out.println(c3);
	    System.err.println(c3.c);
	    System.out.println(c3.d);
	    
	    System.out.println(c3 instanceof ParentUpCasting);
	    System.out.println(c3 instanceof ChildUpCasting);
	    
		
	}

}
