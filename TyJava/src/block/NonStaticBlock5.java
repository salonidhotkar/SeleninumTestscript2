package block;

public class NonStaticBlock5{
	
	public NonStaticBlock5()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
  
		NonStaticBlock5 b1=new NonStaticBlock5();
	}

}
