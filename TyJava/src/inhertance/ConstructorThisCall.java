package inhertance;

public class ConstructorThisCall {
	ConstructorThisCall()
	{
		this(5);
		System.out.println("const1");
	}
	
	ConstructorThisCall(int a)
	{
		System.out.println("const2");
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorThisCall c1 =new ConstructorThisCall();

	}

}
