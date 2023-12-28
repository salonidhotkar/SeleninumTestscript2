package inhertance;

public class ChildSuperCall1 extends ParentSuperCall1 {
	
	ChildSuperCall1 ()
	{
		System.out.println("const2");
	}
	
	ChildSuperCall1(int a)
	{
		System.out.println("const3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChildSuperCall1 c1=new ChildSuperCall1();
     ChildSuperCall1 c2=new ChildSuperCall1(10);
	}

}
