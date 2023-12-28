package block;

public class NonStaticBlock {
	{
		System.out.println("NonStaticBlock");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.out.println("main method");
		NonStaticBlock b1= new NonStaticBlock();
	}
}
