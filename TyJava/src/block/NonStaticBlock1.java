package block;

public class NonStaticBlock1 {
	{
		System.out.println("hello1");
	}
	{
		System.out.println("hello2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NonStaticBlock1 b1 =new NonStaticBlock1();
     System.out.println("main method");
     NonStaticBlock1 b2=new NonStaticBlock1();
	}

}
