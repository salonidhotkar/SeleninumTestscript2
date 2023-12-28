package inhertance;

public class ChildSuperCall3 extends ParentSuperCall3
{
	
	 ChildSuperCall3 () 
	 {
	
	super (10);
	
		System.out.println("const4");
	}
	
	ChildSuperCall3 (int a)
	{
		
	     super(a,20.5);
		System.out.println("const5");
	}
	
	ChildSuperCall3 (int a,double b)
	{
		System.out.println("const6");
	}

	public static void main(String[] args) {
		
		ChildSuperCall3 c1=new ChildSuperCall3();
		ChildSuperCall3 c2=new ChildSuperCall3(10);
		ChildSuperCall3 c3=new ChildSuperCall3(10,20.5);
		// TODO Auto-generated method stub

	}

}
