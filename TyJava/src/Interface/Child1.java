package Interface;

  public class Child1 implements Parent1,Parent2 {
	public void method1()
	{
		System.out.println("method-1");
	}
	public void method2()
	{
		System.out.println("method-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Parent1 p1=new Child1 ();
		p1.method1();
		//p1.method2();
		 Parent2 p2=new Child1();
		 p2.method2();
		 //p2.method1();
;
		 
	}

}
