package block;

public class StaticBlock2 {
	static int a=10;
	
	static
	{
		a=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);

	}

}
