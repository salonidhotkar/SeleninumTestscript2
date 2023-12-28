package inhertance;

public class ChildThisCall extends ParentThiscall {
	
	ChildThisCall(int a)
	{
		System.out.println("const3");
	}
	
	ChildThisCall()
	{
		this(10);
		System.out.println("const4");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChildThisCall c1=new ChildThisCall();
	}

}
