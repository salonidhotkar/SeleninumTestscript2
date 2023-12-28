package Interface;


public class D implements B,C {
	
		public void m1()
		{
			System.out.println("method-1");
		}
				public void m2()
		{
			System.out.println("method-2");
		}
		public void m3()
		{
			System.out.println("method-3");
		}
		
	
	public static void main(String[]args)
	{
		A a1=new D();
		a1.m1();
		//a1.m2();
		//a1.m3();
		
		B b1=new D();
		b1.m1();
		b1.m2();
		//b1.m3();
		
		C c1=new D();
		c1.m1();
		//c1.m2();
		c1.m3();
		
		
	}


}
