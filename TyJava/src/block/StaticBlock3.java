package block;

public class StaticBlock3 {
	static int a=10;
	
	static
	{
		int a=20;
		a=30;
	}
	public static void main(String[]args)
	{
		System.out.println(a);
	}

}
