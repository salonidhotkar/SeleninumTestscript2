package block;

public class NonStaticBlock6 {
	static
	{
		System.out.println("sib-1");
	}
	static
	{
		System.out.println("sib-2");
	}
	
	public NonStaticBlock6()
	{
		System.out.println("const-1");
	}
	{
		System.out.println("iib-1");
	}
	{
		System.out.println("iib-2");
	
	}
	public NonStaticBlock6(int a)
	{
		System.out.println("const-2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticBlock6 b1=new NonStaticBlock6();
				System.out.println("main method");
		NonStaticBlock6 b2=new NonStaticBlock6(10);

	}

}
