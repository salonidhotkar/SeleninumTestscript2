package inhertance;

public class ChildThisCall1 extends ParentThisCall1 {
	ChildThisCall1(int a)
	{
		this (a,20.5);
		System.out.println("const4");
	}
	
	ChildThisCall1(int a,double b)
	{
		super(a);
		System.out.println("const5");
	}
	
	ChildThisCall1()
	{
		this(10);
		System.out.println("const6");
	}
	

}
