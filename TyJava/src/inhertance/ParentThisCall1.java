package inhertance;

public class ParentThisCall1 {
	
	ParentThisCall1 (int a)
	{
		this (a,20.5);
		System.out.println("const1");
		
	}
	
	ParentThisCall1(int a,double b)
	{
		this();
		System.out.println("const2");
	}
	
	ParentThisCall1()
	{
		System.out.println("const3");
	}

}
