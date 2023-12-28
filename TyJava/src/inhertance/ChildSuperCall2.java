package inhertance;

public class ChildSuperCall2 extends ParentSuperCall2  {
	ChildSuperCall2(int a)
	{
		super(20);
		System.out.println("const2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ChildSuperCall2 c3=new ChildSuperCall2(10);
	}

}
