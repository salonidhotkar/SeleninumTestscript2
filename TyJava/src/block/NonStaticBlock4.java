package block;

public class NonStaticBlock4 {
	int a=10;
	{
		int a=20;
		this.a=this.a+a;
		System.out.println(a);
	}
	{
		int a=40;
		a=this.a;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticBlock4 b1= new NonStaticBlock4();
		System.out.println(b1.a);

	}

}
